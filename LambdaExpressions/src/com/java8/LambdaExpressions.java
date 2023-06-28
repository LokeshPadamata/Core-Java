package com.java8;

interface Square{
	public int Squareof(int n);
}
public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = (int n)->{return n*n;};
		System.out.println(sq.Squareof(5));
		System.out.println(sq.Squareof(40));

	}

}
