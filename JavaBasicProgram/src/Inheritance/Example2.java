package Inheritance;// multilevle inheritance
class A1{
	static int a=20;
	int b=30;
	double c=2.5;
	
}
/*B1=child class 
 * A1= parent class
 * all non static member of A1 class will inherited B1 class(all non static member will be present virtualy in class B1)
 * 
 */
class B1 extends A1{
	/*(A1 class non static member virualy present in class B1)
	 * int b=30
	 * double c=2.5
	 */
	static int x=30;
	int y=40;
	double z=3.5;
}
class C1 extends B1{
	// all non static memebr of B1 class inherited C1 class(all non static member will be present virtualy in class C1)
	/*(B1 class non static member virtualy present in class c1
	 * int y=40;
	 * double z=3.5;
	 * 
	 */
	static int p=50;
	int q=40;
	double r=5.5;
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling static variable directly into main body
		System.out.println("static variable class A:"+A1.a);
		System.out.println("static varibale class b:"+B1.x);
		System.out.println("static variable class c:"+C1.p);
		// calling non static variable into main body  creating object 
		C1 ref1=new C1();
		System.out.println("class A non  static variable:"+ref1.b);
		System.out.println("class A  non static variable:"+ref1.c);
		System.out.println("class B non  static variable:"+ref1.y);
		System.out.println("class B non static variable:"+ref1.z);
		System.out.println("class c non static variable:"+ref1.q);
		System.out.println("class cnon  static variable:"+ref1.r);
		// creating object of B1 to calling A1 non satic varible into B1 class
		B1 ref2=new B1();
		System.out.println("class A non static variable:"+ref2.b);
		System.out.println("class A non static variable:"+ref2.c);
		System.out.println("class B  non static variable:"+ref2.y);
		System.out.println("class B  non static variable:"+ref2.z);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
