package encapsulation;

class Employee1{ 
	private  String name;
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class DemoEncaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee1 e=new Employee1();
	e.setName("alex");
	System.out.println(e.getName());
	}
}