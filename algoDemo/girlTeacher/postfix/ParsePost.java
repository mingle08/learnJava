package com.algo.girl.stack.postfix;
/**
 * 解析后缀表达式
 * @author mingle
 *
 */
public class ParsePost {

	private StackB stackB;
	private String input;
	public ParsePost(String s){
		this.input = s;
	}
	
	public int doParse(){
		this.stackB = new StackB(20);
		char ch;
		int j;
		int num1,num2,intersAns;
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			stackB.display(" " + ch + " ");
			if(ch >= '0' && ch < '9'){
				stackB.push(ch-'0');
			}else{
				num2 = stackB.pop();
				num1 = stackB.pop();
				switch(ch){
				case '+':
					intersAns = num1 + num2;
					break;
				case '-':
					intersAns = num1 - num2;
					break;
				case '*':
					intersAns = num1 * num2;
					break;
				case '/':
					intersAns = num1 / num2;
					break;
				default:
					intersAns = 0;
				}
				stackB.push(intersAns);
			}
		}
		intersAns = stackB.pop();
		return intersAns;
	}
}
