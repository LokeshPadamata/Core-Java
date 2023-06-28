package com.java8;

interface AddNumbers{
	public void add(int a, int b);
}
public class Add {
	
	public static void main(String[] args) {
		AddNumbers addn = (int a, int b)->System.out.println(a+b);
		addn.add(3, 7);
	}
}