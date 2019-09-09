package com.begginer.copy;


public class StringBuilderDemo {
	 public static void main(String[] args) {
		 StringBuilder s1 = new StringBuilder("happy");
		 s1.append("Learning");
		 System.out.println(s1);
		 System.out.println(s1.delete(0, 1));
		 
		 System.out.println(s1.insert(1, "Welcome"));
		 System.out.println(s1.reverse());
		 System.out.println(s1.capacity());
		 
	 }
}
