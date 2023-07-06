package com.defaultmethods;
interface interf1{
	default void m1() {
		System.out.println("m1 in Interf1");
	}
}
interface interf2{
	default void m1() {
		System.out.println("m1 in Interf1");
	}
}
public class DefaultMethodimpl implements interf1,interf2 {
	public void m1() {
		//System.out.println("Our implementation");
		interf1.super.m1();
		//interf2.super.m1();
	}
	
	public static void main(String[] args) {
		DefaultMethodimpl defa = new DefaultMethodimpl();
		defa.m1();
	}
}