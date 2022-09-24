package PracticeProgram;


public class RevisionJava {
	 static int x=10, y=20; // static global varible 
	static  char ch='A';
	
	  
	void Show() {
	
	int bike=30; // non static global varible
	double price=20000;
	System.out.println("use bike value:"+bike);
	System.out.println("use price value:"+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("print static Global varible  "+RevisionJava.x);// acces static global  varible using class name
		System.out.println("print static global varible "+y);// acces static global varible using diractly in static main method
		
		RevisionJava ref=new RevisionJava();// acces non static global variable creating ojbect of class 
		//System.out.println("print non static global varible:"+ref.bike);
		//System.out.println("print non static global variable:"+ref.price);
		ref.Show(); // using method name show
		
		
		
		// all are local varible
		
		
		int age=20;// int= datatype age= variblename
		double salary=30;// double = premetive data type, salary=  variblename 
		System.out.println("print age:"+age);
		System.out.println("print salary: "+salary);
		System.out.println("hello everyone \n gud morning");// \n performe the opertion on complier time 

		/* local varibale= a varible declare inside the method is called as local varibale
		 * global variable= a variable declare outside the method body but declare within the  class body
		 * static global variable = a variable declare with static keyword known as static or class varible 
		 * non static global variable= a variable declare without keyword known as non static or instance variable or object varible */
		
		
		
	}

}
