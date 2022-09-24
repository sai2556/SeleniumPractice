package CastingProgram;

public class Primitivecasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// implicit widening
		int empid=205;
		long number=empid;
		float number1=empid;
		double number2=empid;
		System.out.println(empid);
		System.out.println(number);
		System.out.println(number1);
		System.out.println(number2);
		
		//explicit wideing
		long salary=2000;
		float salary1=(float)salary;
		double salary2=(double)salary;
		System.out.println(salary);
		System.out.println(salary1);
		System.out.println(salary2);
		
		// implicit narrowing is not posible in java because in narrowing we canvert lower data type into higher data type and that is not posible in java
		//  implicit narrowing complier do
		
		// explicit narrowing 
		double x=3000;
		int y=(int)x;
		short p=(short)x;
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
		
		
		
		
		
		

	}

}
