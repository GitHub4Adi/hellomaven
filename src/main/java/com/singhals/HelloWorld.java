package com.singhals;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(printHelloWorld("Sunil"));
	}

	public static String printHelloWorld(String username) {
		return "Hello " + username;
	}
}