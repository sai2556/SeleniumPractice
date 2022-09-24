package VariableExample;

public class MethodExample4 {
	public static void address()
	{
		int num1=20, num2=50;
		System.out.println("no one is:"+num1);
		System.out.println("no tow is:"+num2);
		double addition=num1+num2;
		System.out.println("addition of tow no:"+addition);
		}
	
		public double address2(int num1, int num2)
		{
		 System.out.println("no first is:"+num1);
		 System.out.println("no second is:"+num2);
		 double addition2=num1+num2;
		 System.out.println("addition of tow no is:"+addition2);
		 return addition2;
		 	
	}

	public static void main(String[] args) {
		address();//static member call directly in method 
		 System.out.println("*****************");
		 MethodExample4 res1=new MethodExample4();
	     res1.address2(50, 40);
	     double x=res1.address2(50, 40);
	      double y=x+100;
	      System.out.println("final result:"+y);
	     MethodExample4 res2=new MethodExample4();
	     res2.address2(40, 60);
	     
	     
	     
		 
		 
		 
		 
		 
				 
		  
				 
		 
				 
		 
		
		

	}

}
