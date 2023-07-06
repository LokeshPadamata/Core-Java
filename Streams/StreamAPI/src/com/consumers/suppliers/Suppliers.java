package com.consumers.suppliers;

import java.util.function.Supplier;

public class Suppliers {
	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String[] s1 = {"Sunny","Bunny","Chinny"};
			int x = (int)(Math.random()*3+1);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		
	}
}
