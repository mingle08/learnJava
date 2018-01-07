package com.algo.girl.stack.bracketCheck;

import java.io.*;

public class BracketsApp {

	public static void main(String[] args) throws IOException {
		String input;
		while(true){
			System.out.println("Enter a String containing delimiters: ");
			System.out.flush();
			input = getString();
			if("".equals(input))
				break;
			BracketChecker checker = new BracketChecker(input);
			checker.check();
		}

	}
	
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
