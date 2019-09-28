package exception;

public class ThrowsDemo {

	 public static int divide(int a,int b) throws Exception{
		 int c;
		 c=a/b;
		 return c;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ThrowsDemo t=new ThrowsDemo();
	int ans=divide(10,0);
	System.out.println("Result is"+ans);
}
catch(Exception e) {
	System.out.println("Exception is"+e);
}
	}

}
