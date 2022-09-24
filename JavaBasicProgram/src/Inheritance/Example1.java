package Inheritance; // multilevle inheritance
class A{
	static int age=20;
	int salary=2000;
	double percentage= 2.5;
}
class B extends A{
	static int  a=10;
	int b=20;
	double c=20.5;
}
class C extends A{
	static int x=30;
	int y=40;
	double z=3.5;
	
	
	
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// caling static varible direct into main body
		System.out.println("class A static varible:"+A.age);
		System.out.println("class B static variable:"+B.a);
		System.out.println("class c static variable:"+C.x);
		// clling non static variable create object in main body
        A ref=new A();
        System.out.println("Class A non static variable:"+ref.salary);
		System.out.println("class A non static variable:"+ref.percentage);
		
        B ref1=new B();
        System.out.println("class B Non static variable:"+ref1.b);
		System.out.println("class B  non static variable:"+ref1.c);
		System.out.println("class B  non static variable:"+ref1.salary);
		System.out.println("class B  non static variable:"+ref1.percentage);
	    
		C ref2=new C();
		System.out.println("class c non  static variable:"+ref2.y);
		System.out.println("class c non static variable:"+ref2.z);
		
		
		
		
        
		
		

	}

}
