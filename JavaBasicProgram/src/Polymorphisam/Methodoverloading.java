package Polymorphisam;


public class Methodoverloading {
	
	static void show() {
		System.out.println("print show");
	}
	static void show(int a, double b) {
		double c=a*b;
		System.out.println("print:a"+a);
		System.out.println("print:b"+b);
		System.out.println("print c:"+c);
	}
	static void show(int x) {
		System.out.println("print x:"+x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading.show();  // acces static method directly in  main  method  using class name.
		show(); // or accesc directly static method
		
		Methodoverloading.show(20,50);
		show(10,30);
		
		Methodoverloading.show(50);
		show(40);
		
		// when method gets to know its implimentation at the time of complition its known as  complier polymorphisam 
		// this complier polym achived by static method overloading
		

	}

}
