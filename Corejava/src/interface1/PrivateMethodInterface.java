package interface1;
 interface Welcomes{
	 default void say() {
		 sayhello();
		 
	 }
	default  void sayhello() {
		 
				System.out.println("Hello i am private method ");
				
			}
	 
 }
public class PrivateMethodInterface implements Welcomes {
         public static void main(String[] args) {
        	 Welcomes s=new PrivateMethodInterface();
        	 s.say();
}

	
}