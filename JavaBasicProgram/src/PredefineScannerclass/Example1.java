package PredefineScannerclass;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int age=10;
		double salary=2502.25;
		String name="pune";
		boolean valid=true;*/
		 
		Scanner ref=new Scanner(System.in);		
		int age;
		double salary;
		String name;
		boolean valid;
		System.out.println("enter age value in console");
		age=ref.nextInt();
		System.out.println("enter salary value in console");
		salary=ref.nextDouble();
		System.out.println("enter name value in console");
		name=ref.next();
		System.out.println("enter valid value in console");
		valid=ref.nextBoolean();
     int num1,num2;
     
     System.out.println("enter num1");
     num1=ref.nextInt();
     System.out.println("enter num2");
     num2=ref.nextInt();
     char op;
     System.out.println("enter operation");
   op=ref.next().charAt(0);
   System.out.println(op);
   
   Scanner in=new Scanner(System.in);
   int n1,n2,res;
   System.out.println("enter no 1");
   n1=in.nextInt();
   System.out.println("enter no 2");
   n2=in.nextInt();
   res=n1+n2;
   System.out.println("additon result;"+res);
   
          
     
		

	
	
	}
		
	}


