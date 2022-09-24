package PracticeProgram;

public class Integernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=30;
		 double res=a+b;
		System.out.println("addition:"+res);
		
		float p=50f,q=40f;
		double res1=p*q;
		System.out.println("multiplicaton:"+res1);
		
		char small='a';
		for(int i='a';i<='z';i++) {
			System.out.println(small +" "+i);
			small++;
			
		}
		System.out.println("program to find quotient and remainder");
		
		int dividend=100, divisor=8;
		int quotient=dividend/divisor;
		int remainder=dividend%divisor;
		System.out.println("quotient:"+quotient);
		System.out.println("remainder:"+remainder);
		
		System.out.println("******swap to number using third varible****");
		
		int x=30,y=50;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		int z=x;
		 x=y;
		 y=z;
		 System.out.println("x:"+x);
		 System.out.println("y:"+y);
			
	
		
		
		
		
		
		
		
		

	}

}
