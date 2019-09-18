package polymorphism;

 class Vehicle{
   final	  Integer numberOfWheel;
		Long mileage;
		Vehicle()
		{
			numberOfWheel=4;
			System.out.println("Numberr of Wheels" +numberOfWheel);
	}
		 void move() {
			System.out.println("moving in vehicle class");
		}
}
class Bus extends Vehicle{
	 void move() {
		System.out.println("moving the bus");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bus bus=new Bus();
         bus.move();
	}
	
	}


