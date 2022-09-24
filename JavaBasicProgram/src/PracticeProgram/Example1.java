
package PracticeProgram;

public class Example1 {
	
	static int age=52;
	double avrg=50;
	static void show() {
		System.out.println("print static global method");
	}
	int display() {
		System.out.println("print non static global method");
		return 101;
	}  
	void show(int a) {
	
		System.out.println(a);
	}
	void show(int b, double c){
		
	   System.out.println(b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		double salary=5000;
		System.out.println(age);
		Example1 ref=new Example1();
		System.out.println(ref.avrg);
		
		Example1.show();
		Example1 s1=new Example1();
		s1.display();
		Example1.show();
		Example1 s2=new Example1();
		s2.show(45);
		s2.show(20,25);
		

	}

}
