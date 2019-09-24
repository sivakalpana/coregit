package interface1;


interface PrivateMethodStatic extends TestInterface{


	abstract float area();
	static void testaStaticMethod() {
		System.out.println("In test static method is shape");
	}
	default public void displayarea(float area) {
		privateMethod();
		
		System.out.println("display area in shape" +area);
		
	}
	 default void privateMethod() {
}
}



