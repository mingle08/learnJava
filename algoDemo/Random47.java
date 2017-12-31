import java.util.Random;
/**
 * Random(47)每次运行，返回的数字都是同一个数
 * @author mingle
 *
 */
public class Random47 {

	public static void main(String[] args) {
		Random rand47 = new Random(47);
		int i = rand47.nextInt(100);
		System.out.println(i);
		
		System.out.println("===========");
		
		Random rand = new Random();
		int ii = rand.nextInt(100);
		System.out.println(ii);

	}

}
