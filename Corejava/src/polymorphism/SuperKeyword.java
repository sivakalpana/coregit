package polymorphism;
class Vehicles11{
	String wheels="Vehicles moves because of wheels";
}
class Truck extends Vehicles11{
	String wheels="Truck has 4 wheels";
	void PrintWheel() {
      System.out.println(wheels);	
      System.out.println(super.wheels);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Truck t=new Truck();
       t.PrintWheel();
	}

}
