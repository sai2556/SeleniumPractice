package PracticeProgram;

public class Multiplicationflotingno {
	public static float floataddition(float a,float b) {
		System.out.println("number one is:"+a);
		System.out.println("number tow is:"+b);
		float result=a*b;
		System.out.println("multiplication:"+result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=20f,b=10f;
		System.out.println("Number one is:"+a);
		System.out.println("number tow is:"+b);
		float result=a*b;
		System.out.println("Multiplication of tow float number:"+result);
		// calling gloabal variable creatin method
		floataddition(25f,30f);
		
		

	}
}
