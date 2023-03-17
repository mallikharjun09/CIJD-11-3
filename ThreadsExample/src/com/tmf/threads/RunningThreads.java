package com.tmf.threads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RunningThreads {
	public static boolean checkPrime(int x) {
		int factorCount = (int)IntStream.range(1, x+1).filter(i->x%i==0)
				.count();
		return (factorCount==2)?true:false;
	}
	public static void main(String[] args) {
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		IntStream.range(x,y+1)
				.filter(i->new RunningThreads().checkPrime(i) == true)
				.forEach(System.out::println);
	}
}
