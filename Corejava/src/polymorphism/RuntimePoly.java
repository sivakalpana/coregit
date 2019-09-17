package polymorphism;


class Man{
	void pay()
	{
		System.out.println("Paying Bill");
		
	}
}
class Millionaire extends Man{
	void pay()
	{
		System.out.println(" Millionaire isPaying Bill and giving tip also");
		
	}
}
public class RuntimePoly {

	public static void main(String[] args) {
		
        Man obj=new Millionaire();
        obj.pay();
	}

}
