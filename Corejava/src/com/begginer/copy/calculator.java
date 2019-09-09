package com.begginer.copy;

public class calculator {
// private Integer result;

public Integer add (Integer arg1 , Integer arg2) {
      arg1 = 100;
      Integer result = arg1+arg2 ;
	 return result ;     
}
public Integer add (Integer arg1 , Integer arg2 , Integer arg3) {
    
    Integer result = arg1+arg2+arg3 ;
	 return result ;     
}

public static void main(String[] args) {
	calculator cal = new calculator();
	int arg1 = 10;
	int arg2 = 30;
	int arg3 = 40;
	
	System.out.println("printing arg1 before passing it by value" +arg1);
	Integer result = cal.add(arg1 , arg2);
	System.out.println("printing arg1 after passing it by value to add Method");
	System.out.println("Result of adddition is " +result);
	Integer resultFromNewAddmethod = cal.add(arg1, arg2, arg3);
	System.out.println("Result from new Addmethod" + resultFromNewAddmethod);
	
}
 
 }