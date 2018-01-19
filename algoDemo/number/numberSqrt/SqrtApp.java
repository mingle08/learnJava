package com.algo.girl.numberSqrt;

import java.util.Scanner;

public class SqrtApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("Please enter a number: ");
			String str = s.nextLine();
			if(str == null || "".equals(str)){
				break;  // 跳出while循环
			}
			double d = Double.parseDouble(str);
			// 牛顿迭代法
//			double sqrt = NewtonMethod.sqrt1(d);
			
			int i = Integer.parseInt(str);
			int sqrt = BinarySearch.sqrt(i);
			System.out.println(str + "的平方根：" + sqrt);
		}

	}

}
