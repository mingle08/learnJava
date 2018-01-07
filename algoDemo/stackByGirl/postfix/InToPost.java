package com.algo.girl.stack.postfix;

/**
 * 中缀表达式 ---> 后缀表达式
 * @author mingle
 *
 */
public class InToPost {

	private StackA stackA;
	private String input;	// 中缀表达式
	private String output="";  // 后缀表达式
	public InToPost(String in){
		this.input = in;
		int stackSize = input.length();
		this.stackA = new StackA(stackSize);
	}
	
	public String doTrans(){
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			stackA.display("for " + ch + " ");
			switch(ch){
			case '+':
			case '-':
				gotOper(ch,1);  // 1是级别
				break;
			case '*':
			case '/':
				gotOper(ch,2);   // 2是级别
				break;
			case '(':
				stackA.push(ch);
				break;
			case ')':
				gotParenthesis(ch);
				break;
			default:
				output = output + ch;
				break;
			}
		}// for循环结束
		while(!stackA.isEmpty()){
			stackA.display("while ");
			output = output + stackA.pop();
		}
		stackA.display("End ");
		return output;
	}
	
	/**
	 * 往栈里存放
	 * @param op
	 * @param prec1
	 */
	public void gotOper(char op, int prec1){
		while(!stackA.isEmpty()){
			char opTop = stackA.pop();
			if(opTop == '('){
				stackA.push(opTop);
				break;
			}else{
				int prec2; // 优先级
				if(opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				
				if(prec2 < prec1){
					stackA.push(opTop);
					break;
				}else{
					output = output + opTop;
				}
			}
		}
		stackA.push(op);
	}
	/**
	 * 小括号
	 * @param ch
	 */
	public void gotParenthesis(char ch){
		while(!stackA.isEmpty()){
			char c = stackA.pop();
			if(c == '('){
				break;
			}else{
				output = output + c;
				
			}
		}
	}
}
