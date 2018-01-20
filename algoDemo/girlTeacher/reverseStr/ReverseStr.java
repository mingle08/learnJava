package com.algo.girl.stack.reverseStr;

public class ReverseStr {

	private String input;
	private String output;
	public ReverseStr(String in){
		this.input = in;
	}
	
	public String doRev(){
		int stackSize = input.length();
		StackX stackX = new StackX(stackSize);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			stackX.push(ch);
		}
		output = "";
		while(!stackX.isEmpty()){
			char c = stackX.pop();
			output = output + c;
		}
		return output;
	}
}
