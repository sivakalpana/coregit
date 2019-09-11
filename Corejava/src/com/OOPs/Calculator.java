package com.OOPs;

public class Calculator {
 final static String CONSTANT_EXAMPLE = "myconstant";
 int instanceVariable;
 Calculator(int value){
	 instanceVariable = value;
	 }
 Calculator(int value1 , int value2){
	 instanceVariable = value1+value2;
	 
 }
 public static void main(String[] args) {
	 
 
 Calculator cal = new Calculator(110,30);
 System.out.println("value of instance variable initialize by default constructor" +cal.instanceVariable);
 }
 }