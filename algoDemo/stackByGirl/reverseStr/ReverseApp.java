package com.algo.girl.stack.reverseStr;
import java.io.*;

public class ReverseApp {

	public static void main(String[] args)throws Exception {
		String input,output;
		while(true){
			System.out.println("Enter a String: ");
			System.out.flush();
			input = getString();
			if("".equals(input))break;
			ReverseStr reverseStr = new ReverseStr(input);
			output = reverseStr.doRev();
			System.out.println("ReverseStr: " + output);
		}

	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
