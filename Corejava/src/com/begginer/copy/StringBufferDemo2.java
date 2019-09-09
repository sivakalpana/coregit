package com.begginer.copy;

public class StringBufferDemo2 {
 public static void main(String[] args) {
	 StringBuffer s = new StringBuffer("Welcomes you");
	StringBuffer newString =  s.append("!!!");
	 System.out.println(newString);
	 s.insert(0 , 'w');
	 System.out.println(s);
	 s.replace(0 , 2, "good");
	 System.out.println(s);
	 s.delete(0 ,  1);
	 System.out.println(s);
	 System.out.println(s.reverse());
	 System.out.println(s.capacity());
	 
 }
}
