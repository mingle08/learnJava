package com.algo.girl.stack.postfix;

import java.io.*;

public class PostfixApp {

	public static void main(String[] args) throws IOException {
		String input;
		int output;
		InToPost inobj;
		while(true){
			System.out.println("Enter infix: ");
			System.err.flush();
			input = getString();
			if("".equals(input))break;
			inobj = new InToPost(input);
			input = inobj.doTrans(); // input中现在存的是后缀表达式
			System.out.println("后缀表达式：" + input);
			ParsePost trans = new ParsePost(input);
			output = trans.doParse();
			System.out.println("Evalutes to: " + output);
		}

	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
