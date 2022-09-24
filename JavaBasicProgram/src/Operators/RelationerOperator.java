package Operators;

public class RelationerOperator {

	public static void main(String[] args) {
		int num1=40,num2=30;
		System.out.println("num1:"+num1+"..>num2:"+num2);
		//equals to operation
		boolean res=(num1==num2);
		System.out.println("num1==num2="+res);
		// or
		System.out.println("num1==num2="+(num1==num2));
	 System.out.println("****not equals to operation****");
	 boolean res1=(num1!=num2);
	 System.out.println("num1!=num2="+res1);
	 //or
	 System.out.println("num1!=num2="+(num1!=num2));
	 System.out.println("*********greterthan operation*****");
	 boolean res3=(num1>num2);
	 System.out.println("num1>num2="+res3);
	 System.out.println("********lessthan operator*****");
	 boolean res4=(num1<num2);
	 System.out.println("num1<num2="+res4);
	 System.out.println("******greterthan equals to****");
	 boolean res5=(num1>=num2);
	 System.out.println("num1>=num2="+res5);
	 System.out.println("*********less than equals to******");
	 boolean res6=(num1<=num2);
	 System.out.println("num1<=num2="+res6);
	 
	 
		
		

	}

}
