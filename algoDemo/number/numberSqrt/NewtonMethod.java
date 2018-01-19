package com.algo.girl.numberSqrt;

public class NewtonMethod {

	/**
	 * newton迭代法
	 * 只适合正数
	 */
	public static double sqrt1(double c){
		if(c < 0){
			return Double.NaN;
		}
		double err = 1e-15;  // 极小值
		double t = c;
		while(Math.abs(t - c / t) > err * t){
			t = (t + c / t) / 2.0;
		}
		return t;
	}
	
}
