package polymorphism;

public class MethodDemo {

	public void area(int b,int h)
	{
		System.out.println("Area of Triangle:" +(0.5*b*h));
		
	}
	public void area(int r)
	{
		System.out.println("Area of circle:" +(3.14*r*r));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodDemo a = new MethodDemo();
       a.area(4, 6);
       a.area(5);
	}

}
