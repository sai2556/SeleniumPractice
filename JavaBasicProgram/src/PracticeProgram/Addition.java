package PracticeProgram;

public class Addition {
	public static int Addition1(int num1,int num2) {
		//to get return value we use this type of program
		//static global variable
		int result=num1+num2;
		System.out.println("number one is:"+num1);
		System.out.println("number tow is :"+num2);
		System.out.println("addition of tow integer:"+result);
		return result;
	}
	static void Addition2(int a, int b) {
		//without geting return value use void 
		System.out.println("number one is:"+a);
		System.out.println("number tow is:"+b);
		int result=a+b;
		System.out.println("final addition of tow integer:"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variable
		int a=20,b=30;
		int result=a+b;
		System.out.println("Number one is:"+a);
		System.out.println("Number tow is:"+b);
		System.out.println("addition of tow integer:"+result);
		Addition1(25,35);
		int x=25,y=30;
		Addition1(x,y);
		int store=Addition1(x,y);
		int finalvalue=store/5;
		System.out.println("result:"+finalvalue);
		
		
		

	}

}
