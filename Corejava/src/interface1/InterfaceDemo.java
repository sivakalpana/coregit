package interface1;

interface Money{
	void Operation();
	
}
class Debit implements Money{
	public void Operation() {
		System.out.println("Debbiting the money from the account ");
		
	}
}
class Credit implements Money{
	public void Operation() {
		System.out.println("Crediting the money from the account ");
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Money d=new Credit();
          d.Operation();
	}

}
