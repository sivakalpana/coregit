package exception;

public class NestedTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  try {
    		  int a=50;
    		  int b=0;
    		  System.out.println("Division is" +(a/b));
    		
    	  }
    	  catch(ArithmeticException e) {
    		  System.out.println("Arithmetic exception divide by zero has occure");
    	  }
    	  try {
    		  int a[]= {1,3,5};
    		  System.out.println(a[5]);
    	  }
    	  catch(ArrayIndexOutOfBoundsException e) {
    		  System.out.println("we are trying to access elementsof array which is out of bound");
    	  }
      }
      catch(Exception e) {
    	  System.out.println("Exception occure");
      }
	}

}
