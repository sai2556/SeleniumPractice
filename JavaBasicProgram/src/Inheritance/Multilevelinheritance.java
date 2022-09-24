package Inheritance;
class G
{
	static int p=30;
	int q=40;
	double r=60;
}class H extends G{
	static int x=50;
	int y=40;
	double z=55;
}class J extends H{
	static int o=90;
	int l=20;
	double m=40;
	
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static variable class A:"+G.p);
		System.out.println("static variable class A:"+H.x);
		System.out.println("static variable class A:"+J.o);
		J ref=new J();
		System.out.println(" non static variable class A:"+ref.y);
		System.out.println("non static variable class A:"+ref.l);
		System.out.println("non static variable class A:"+ref.m);
		System.out.println("non static variable class A:"+ref.z);
	     
	 
	 
		
		
			

	}

}
