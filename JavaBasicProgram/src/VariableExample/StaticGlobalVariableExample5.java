package VariableExample;

public class StaticGlobalVariableExample5 {
	static int num1,num2=30,res;
	

	public static void main(String[] args) {
		System.out.println("program start");
		System.out.println("number 1 is:"+num1);
		System.out.println("number 2 is :"+num2);
		res=num1+num2;
		System.out.println("result"+res);
		System.out.println("******updated value*****");
		num1=40;
		System.out.println("number 1 is:"+num1);
		System.out.println("number 2 is :"+num2);
		res=num1+num2;
		System.out.println("result"+res);
		System.out.println("*****updated value*****");
		num1=40;
		num2=50;
		res=num1-num2;
		System.out.println("number 1 is:"+num1);
		System.out.println("number 2 is :"+num2);
		System.out.println("result"+res);
		System.out.println("program end");
		
	}

}
//static member will  have single memory allocation throughout the execaution then any chang in its value will impact the orignal value
