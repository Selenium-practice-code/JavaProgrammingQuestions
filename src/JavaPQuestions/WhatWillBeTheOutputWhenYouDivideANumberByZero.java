package JavaPQuestions;

public class WhatWillBeTheOutputWhenYouDivideANumberByZero {

	public static void main(String[] args) {
		 
		System.out.println(9.0/0);// Infinity
		System.out.println(12.33f/0);// Infinity
		System.out.println(10/0.0);// Infinity
		System.out.println(19.99999d/0);// Infinity
		//System.out.println(0/0);// Arithmetic Exception
		System.out.println(0.0/0); // Nan
	}

}
