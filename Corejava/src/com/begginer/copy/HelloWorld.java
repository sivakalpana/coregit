package com.begginer.copy;

public class HelloWorld {
	public void nonStaticTest() {
		System.out.println(" Non static method");
		
	}
	public static void StaticTest() {
		System.out.println("String method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld helloWorldObject = new HelloWorld();
		System.out.println("HELLOWORLD");
		helloWorldObject.nonStaticTest();
		StaticTest();
		

	}

}
