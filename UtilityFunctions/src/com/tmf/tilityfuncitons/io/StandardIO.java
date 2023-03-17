package com.tmf.tilityfuncitons.io;

import java.util.Scanner;

public class StandardIO {
	
	Scanner scan = new Scanner(System.in);
	
	public void out(String msg) {
		System.out.println(msg);
	}
	public void out(int num) {
		System.out.println(num);
	}
	public void out(long num) {
		System.out.println(num);
	}
	
	public int readInt(String msg) {
		System.out.println(msg);
		int x = scan.nextInt();
		scan.nextLine();
		return x;
	}
	public float readFloat(String msg) {
		System.out.println(msg);
		float x = scan.nextFloat();
		scan.nextLine();
		return x;
	}
	public long readLong(String msg) {
		System.out.println(msg);
		long x = scan.nextLong();
		scan.nextLine();
		return x;
	}
	public double readDouble(String msg) {
		System.out.println(msg);
		double x = scan.nextDouble();
		scan.nextLine();
		return x;
	}
	public String readString(String msg) {
		System.out.println(msg);
		String x = scan.nextLine();
		scan.nextLine();
		return x;
	}
	public char readChar(String msg) {
		System.out.println(msg);
		String x = scan.nextLine();
		if(x.length()>1) {
			System.err.println("Give a single character only");
			return '\0';
		}
		else {
		  return x.charAt(0);
		}
	}
	
}
