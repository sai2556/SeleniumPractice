package Operators;

public class Logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res1=true,res2=false;
		//logical And operation
		boolean result=(res1&&res2);
		System.out.println("res1&&res2="+result);
		//or
		System.out.println("res1&&res2="+(res1&&res2));
		//logical or operation
		boolean result2=res1||res2;
		System.out.println("res1||res2="+result2);
		
		//logical Not operation
		boolean result3=!(res1&&res2);
		System.out.println("!(res1&&res2)="+result3);
		
		
		

	}

}
