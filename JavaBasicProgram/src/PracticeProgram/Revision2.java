package PracticeProgram;

public class Revision2 {
	
	 static int returnvalue() {
		int num1=10,num2=20;
		 System.out.println("print num1:"+num1);
		 System.out.println("print num2"+num2);
		 int res=num1+num2;
		 System.out.println("final result :"+res);
		 return res;
	 }
	
		
		  static double  Method1 (int age , int salary) 
		  {
		
			System.out.println("print age and salary:"+age);
			System.out.println("print salary:"+salary);
			int fin= age + salary;
			System.out.println("print fin:"+fin);
			return fin;
			
		}
		  void Method2() {
			  int empid=10;
			  double salary=2500;
			  System.out.println("print empid:"+empid);
			  System.out.println("print salary:"+salary);
			  
			  
		  }
		

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=20;
	 System.out.println("print num1:"+num1);
	 System.out.println("print num2"+num2);
	 double res=num1+num2;
	 System.out.println("final result :"+res);
       
	 returnvalue();
	 double x=returnvalue();
	 double y=100+x;
	 System.out.println("updated value:"+y);
	  System.out.println("*******static globalvarible************");
	 Method1(20,2000);// static method call directly
	 System.out.println("******* non static globalvarible************");
	 
	 Revision2 p1=new Revision2();
     p1.Method2();	 
	}

}
