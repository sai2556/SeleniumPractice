package VariableExample;

public class MethodAdditon 
{
	public static void Addnumber1(int num1, int num2)
	{
		System.out.println("number one"+num1);
		System.out.println("number tow"+num2);
		int add=num1+num2;
		System.out.println("addition"+add);
		
	}
	public static int Addnumber2(int num1, int num2)
	{
		System.out.println("number one"+num2);
		System.out.println("number tow"+num2);
		int add2=num1+num2;
		System.out.println("additon"+add2);
		return add2;
	}
	

	public static void main(String[] args) {
		//calling static method which has return type void with directly passing parameter
		Addnumber1(10,20);
		System.out.println("************************");
		int x=20,y=30;
		Addnumber2(x,y);
		System.out.println("*************************");
		int res=Addnumber2(x,y);
		int finalvalue=res/5;
		System.out.println("get final"+finalvalue); 
		
		
	
		// TODO Auto-generated method stub

	}

}
