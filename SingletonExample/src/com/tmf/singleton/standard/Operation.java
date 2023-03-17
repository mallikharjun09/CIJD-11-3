package com.tmf.singleton.standard;

public class Operation {
	private static int x,y;
	private Arithmetics opt;
	public Operation(int x,int y,Arithmetics opt) {
		this.x = x;
		this.y = y;
		this.opt = opt;
	}
	
	public void getResult() {
		System.out.println(opt);
	}
	
	private enum Arithmetics {
		ADD(x,y) {
			public String toString() {
				return x+" + "+y+" = "+(x+y);
			}
		},
		DIFF(x,y) {
			public String toString() {
				return x+" - "+y+" = "+(x-y);
			}
		};
		
		private Arithmetics(int x,int y) {}
	}
}
