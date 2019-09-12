package StaticKeyWord;


class Employee{
	int id;
	int salary;
	static String company="SRT Traders";
	static void check() {
		company="WIIT";
	}
	Employee(int i , int s){
		id=i;
		salary=s;
		
	}
	void dispaly() {
		System.out.println(id+ " " +salary+ " " +company);
		
	}
}
public class StaticKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1= new Employee(25,25000);
       Employee e2= new Employee(30,25000);
       e1.dispaly();
       e2.dispaly();
	}

}
