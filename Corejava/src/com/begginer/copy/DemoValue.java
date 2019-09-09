package com.begginer.copy;

public class DemoValue {
	public int sample(int a ,int b ) {
		int i=0;
		for(i=a; i<b; i++) {
		}
		return i;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoValue dv = new DemoValue();
		int num = dv.sample(2,5);
        System.out.println("num");  
	}

}
