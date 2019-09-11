package com.OOPs;

class Employee {
	int id;
	String name;
	Employee(int i , String n){
		id = i;
		name = n;
	}
	void display() {
		System.out.println(id+ " " +name);
	}
}
public class ParamaterizedConstr {
 public static void main(String[] args) {
	 Employee e1 = new Employee(2,"Alice");
	 Employee e2 = new Employee(10,"Alex");
	 e1.display();
	 e2.display();
 }
}
