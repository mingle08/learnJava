package com.algo.girl.stack.postfix;

public class StackA {

	private int maxSize;
	private char[] stackArr;
	private int top;
	public StackA(int max){
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
	
	public int size(){
		return top + 1;
	}
	
	public char peekN(int n){
		return stackArr[n];
	}
	
	public void display(String s){
		System.out.print(s);
		System.out.print("Stack (bottom ---> top): ");
		for (int i = 0; i < size(); i++) {
			System.out.print(peekN(i)+ " ");
		}
		System.out.println();
	}
}
