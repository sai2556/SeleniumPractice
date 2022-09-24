package CastingProgram;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary=2000;
		double amount=salary;//  wideing implicite casting (auto widening)  complier do 
		double amount1=(double)salary;// wideing explicite casting  perform programer
		System.out.println("salary"+amount);
		System.out.println("salary"+amount1);
		 double age=30;
		 int result= (int)age;// narrowing explicite
		 short result1=(short)age;// narrowing expliciti    widening is not perform 
		 
		 // result wiil be same 
		 System.out.println("result:"+result);
		 System.out.println("result:"+result1);
		 System.out.println("result:"+age);

	}

}
