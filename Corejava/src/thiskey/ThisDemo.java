package thiskey;

class ClassInfo{
	int rollno;
	String name;
	ClassInfo(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
		
	}
	void display() {
		System.out.println(rollno+ " " +name);
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInfo c1= new ClassInfo(10, "sasi");
		ClassInfo c2= new ClassInfo(12, "sai");
		c1.display();
		c2.display();
	}
	

}
