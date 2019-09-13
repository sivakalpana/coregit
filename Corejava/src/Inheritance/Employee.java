package Inheritance;

public class Employee extends Manager  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee emp=new Employee();
       emp.salary=1000;
       System.out.println("salary of employee is" +emp.salary);
       Manager man=new Manager();
       man.salary=10000;
       System.out.println("salary of Manager is" +man.salary);
	}

}
