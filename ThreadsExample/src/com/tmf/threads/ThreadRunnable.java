package com.tmf.threads;

public class ThreadRunnable implements Runnable{
	public void run() {
		for(int i=1;i<10;i++) {
			try {
			System.out.println("Thread runnable is running");
			Thread.sleep(300);
			}catch(Exception e) {
				
			}
		}
	}
}
