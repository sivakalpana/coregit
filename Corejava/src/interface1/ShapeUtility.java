package interface1;

public class ShapeUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateMethodStatic.testaStaticMethod();
		Shape circle=new Circle();
        float areaofCircle=circle.area();
         System.out.println("Area of circle" +areaofCircle);
        Shape square= new Square();
        System.out.println("Area of square" +square.area());
	}

}
