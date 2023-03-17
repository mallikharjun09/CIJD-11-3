package com.tmf.tilityfuncitons.io;

public class Addition {
	public static void main(String[] args) {
		StandardIO io = new StandardIO();
		
		int x = io.readInt("Enter first number ");
		int y = io.readInt("Enter second number ");
		io.out(x+y);
		
		char ch = io.readChar("Enter a character ");
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			io.out(ch+" is a vowel");
		}
		else {
			io.out(ch+" is a consonant");
		}
	}
}
