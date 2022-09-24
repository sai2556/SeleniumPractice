package Abstract;

abstract class A{
	 abstract void show();// when  we declare any abstract method in class
	                         //then class should declare as abstract
	 
	 static void show1() {
		 System.out.println("run show1()");
	 }
	 
}
	 class B extends A{
		 void show() {
			 System.out.println("run show()");// when inheritance abstract class then 
			                                    //we can overidde abstract class method
		 }
	 }
	 


public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //        A ref=new A();  we cannot create object of abstract class
		A.show1(); //we can acess static method using class name 
	  B ref=new B();	
	  ref.show(); 
	}

}
