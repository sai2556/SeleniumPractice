package PracticeProgram;
class K{
	 void name() {
		 System.out.println("hello method name");
	 }
	 void address() {
		 System.out.println("hello method address");
		 name();
	 }
}

public class Thiskeyword {
	 static int age=36;
	 int empid=501;
	 void display() {
		 int empid=101;
		 System.out.println("print local empid="+empid);
		 System.out.println("print global empid="+this.empid);
	 }
	 static int price;
	 int product;
	 int emi;
	 void display(int product) {
		// product=45000;
		 System.out.println("local member prodcut="+product);
		 System.out.println("global member  emi ="+this.emi);
		 }
	 
	 int m=20;
	 void N(int m) {
		 System.out.println(m);
		 System.out.println(this.m);
	 }
	 void call() {
		 int o=56;
		 System.out.println(o);
		 this.N(30);
		 
	 }
	 
	 
	 
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("acces static gloabl varible="+Thiskeyword.age);
		// create object to accces non static member
		Thiskeyword ref=new Thiskeyword();
		ref.display();
		System.out.println("global memeber price="+Thiskeyword.price);
		Thiskeyword.price=25000;
		System.out.println("global member updated price="+Thiskeyword.price);
		Thiskeyword ref2=new Thiskeyword();
		ref2.display(5000);
		ref2.emi=3600;// initilize emi value 
		ref2.display(1000);
		K ref3=new K();
		ref3.address();
		
		ref.N(25);
		ref.call();
		
		

	}

}
// this keyword use to differentiate non static global member and local variable
// this keyword should use only inside non static method