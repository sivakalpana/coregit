package Inheritance;

public class SuperCar extends Car {
   public void turbo(){
	   System.out.println("in turbo method");
   }
	
	
	
   public void changeWheels() {
		numberOfWheels=4;
		behaviorSpecificToCar();
	}
}
