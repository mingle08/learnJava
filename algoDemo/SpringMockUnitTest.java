import org.junit.Before;  
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.test.web.servlet.MockMvc;  
import org.springframework.test.web.servlet.setup.MockMvcBuilders;  
import org.springframework.web.context.WebApplicationContext;  
  
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;  
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;  
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;  
  
import org.junit.runner.RunWith;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
import org.springframework.test.context.web.WebAppConfiguration;  
  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(classes = RootConfig.class)  
@WebAppConfiguration  
public class MockTest {  
  
    @Autowired  
    private WebApplicationContext wac;  
    private MockMvc mockMvc;  
  
    @Before  
    public void setup() {  
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();  
    }  
  
    @Test  
    public void demoget() throws Exception {  
        mockMvc.perform(get("/hello"))  
                .andExpect(status().isOk())  
                .andDo(print())  
                .andExpect(model().attribute("message", "Hello Reader!"))  
                .andExpect(view().name("helloReader"));  
    }  
  
    @Test  
    public void demopost() throws Exception {  
        this.mockMvc.perform(  
                post("/result")  
                        .param("username", "johndoe")  
                        .param("email", "john@doe.com")  
                        .param("ccNumber", "5245771326014172")  
                        .param("password", "TestR0ck"))  
                .andExpect(status().isOk())  
                .andExpect(view().name("userResult"))  
                .andExpect(model().hasNoErrors())  
                .andExpect(model().attribute("u", hasProperty("username", is("johndoe"))))  
                .andExpect(model().attribute("u", hasProperty("email", is("john@doe.com"))))  
                .andExpect(model().attribute("u", hasProperty("ccNumber", is("5245771326014172"))))  
                .andExpect(model().attribute("u", hasProperty("password", is("TestR0ck"))));  
    }  
} 