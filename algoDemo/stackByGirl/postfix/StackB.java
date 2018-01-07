package com.algo.girl.stack.postfix;
/**
 * 存储操作数
 * @author mingle
 *
 */
public class StackB {

	private int maxSize;
	private int[] stackArr;
	private int top;
	public StackB(int max){
		maxSize = max;
		stackArr = new int[maxSize];
		top = -1;
	}
	
	public void push(int j){
		stackArr[++top] = j;
	}
	
	public int pop(){
		return stackArr[top--];
	}
	
	public int peek(){
		return stackArr[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == maxSize - 1;
	}
	
	public int size(){
		return top + 1;
	}
	
	public int peekN(int n){
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
