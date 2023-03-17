package com.tmf.singleton.app;

import com.tmf.singleton.standard.StandardIO;

public class SingletonCalls {
	public static void main(String[] args) {
		StandardIO sio = StandardIO.ioBuilder();
		int x = sio.readInt("Enter first number ");
		int y = sio.readInt("Enter second number ");
		sio.out(x/(y*1.0));
	}
}
