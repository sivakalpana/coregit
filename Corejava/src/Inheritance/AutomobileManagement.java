package Inheritance;

public class AutomobileManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car mercedes=new Car();
        Vehicle vehicle1=mercedes;
        vehicle1.move();
        Vehicle vehicle2=new Vehicle();
        vehicle2.move();
       /* Car BMW=new Car();
        mercedes.numberOfWheels=4;
        Bike r1=new Bike();
        Bike ducat=new Bike();
        r1.numberOfWheels=2;
        ducat.numberOfWheels=2;
        BMW.move();*/
	}

}
