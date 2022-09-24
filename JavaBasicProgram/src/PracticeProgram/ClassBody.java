package PracticeProgram;

public class ClassBody {
	static int age;
	double salary;
	static {        // static block use to intilize static varible
		age=20;
		System.out.println("static block initilization");
	}
	{
		salary=2050; // non static block uee to initialize non static variable
	System.out.println(" non static block initialize");
	}
	ClassBody(){
		System.out.println("zero parameter constrctor");
	}
	static void display() {
		System.out.println("i am static display() method");
	}
	void show() {
		System.out.println("non satatic show() method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	display();
	ClassBody ref=new ClassBody();
	ref.show();

	}

}
