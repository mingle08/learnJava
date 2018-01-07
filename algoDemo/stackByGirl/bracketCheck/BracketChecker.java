package com.algo.girl.stack.bracketCheck;



/**
 * 括号检查｛｝[] ()
 * @author mingle
 *
 */
public class BracketChecker {

	private String input;
	public BracketChecker(String in){
		this.input = in;
	}
	
	public void check(){
		int stackSize = input.length();
		StackX stackX = new StackX(stackSize);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			switch(ch){
			case '{':
			case '[':
			case '(':
				stackX.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if(!stackX.isEmpty()){
					char x = stackX.pop();
					if((ch == '}' && x != '{') 
						|| (ch == ']' && x != '[')
						|| (ch == ')' && x != '(')){
						System.out.println("Error: " + ch + " at " + i);
					}
				}else{
					System.out.println("Error: " + ch + " at " + i);
				}
				break;
			default:
				break;
			}
		}
		// 循环完成之后，如果栈里还有东西，说明缺少右边的括号
		if(!stackX.isEmpty())System.out.println("Error: missing the right bracket");
	}
}
