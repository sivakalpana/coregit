package polymorphism;

public class MethodOverload {

	public void display(int x)
	{
		System.out.println("Welcome to Integers");
		
	}
	public void display(String y)
	{
		System.out.println("Welcome to Strings");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodOverload mo=new MethodOverload();
       String s="Hello";
       mo.display(s);
       mo.display(12);
	}

}
