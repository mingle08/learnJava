package com.algo.girl.stack.reverseStr;

public class StackX {

	private int maxSize;
	private char[] stackArr;
	private int top;
	public StackX(int max){
		maxSize = max;
		stackArr = new char[maxSize];
		top = -1;
	}
	
	public void push(char j){
		stackArr[++top] = j;
	}
	
	public char pop(){
		return stackArr[top--];
	}
	
	public char peek(){
		return stackArr[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
}
