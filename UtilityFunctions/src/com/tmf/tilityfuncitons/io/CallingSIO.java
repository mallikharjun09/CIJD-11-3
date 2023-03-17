package com.tmf.tilityfuncitons.io;

public class CallingSIO {
	public static void main(String[] args) {
		StandardIO io = new StandardIO();
		io.out("Welcome to My own functions");
		int x = 10,y = 20;
		io.out(x+y);
		io.out(56465465465465465L);
		
		char ch = io.readChar("Enter a character");
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u') {
			io.out(ch+" is a vowel");
		}
		else {
			io.out(ch+" is a consonant");
		}
		
		int a = io.readInt("Enter the first number ");
		int b = io.readInt("Enter the second number ");
		io.out(a+" + "+b+" = "+(a+b));
	}
}
