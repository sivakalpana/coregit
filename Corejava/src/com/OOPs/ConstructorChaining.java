package com.OOPs;

class Student {
	public String sName;
	public int sMarks;
	//default constructor of the class
	public Student()
	{
		//this will call the constructor with string param
		this("Meghan");
		
	}
	public Student(String name) {
	//call the constructor with (string ,int) param
	this(name ,70);
	}
	public Student(String name , int mark)
	{
		this.sName = name;
		this.sMarks = mark;
		
	}
	void disp() {
	System.out.println("Student Name;" +sName);
	System.out.println("Student Marks;" +sMarks);
	
	}
}

     public class ConstructorChaining{
    	 public  static void main(String[] args) {
    	 Student s = new Student();
    	 s.disp();
     }
     }

