package Logicaloperator;

public class Ifcondition1 {

	public static void main(String[] args) {
	  int num=50;
	  if(num%2==0)
	  {
		  System.out.println("given number is even");
	  }else 
	  {
		System.out.println("given number is odd");
	  }
	  int num1=25,num2=30;
	  if(num1!=num2 && num1<=num2)
	  {
		  System.out.println("num2 is greter than or equal to num1");
	  }else {
		  System.out.println("num1 is less than num2");
	  }
	  
	  int age=25;
	  if(age>18) {
		  System.out.println("eligible for blood donate");
	  }
	  int age1=17;
	  if(age1>18) {
		  System.out.println("eligible for blood donate");
	  }else {
		  System.out.println("not eligible for blood donate");
	  }
	  int age2=20;
	  int weight=47;
	  if(age2>=21) {
		  if(weight>48) {
			  System.out.println("allow to donate blood");
			  
		  }else {
			  System.out.println("not allowed to donate blood");
		  }
	  }else {
		  System.out.println("age must be grater than 21");
	  }
	  
	  
	  
	  
	  
	
	  
	 

	}

}
