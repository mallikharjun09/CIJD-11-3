package com.tmf.threads;

public class ThreadClass extends Thread{
	public void run() {
		for(int i=1;i<10;i++) {
			try {
			System.out.println("Thread class is executing");
			Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
