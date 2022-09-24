
public class MethodEx2 {
	
	public static void addition1(int num1, int num2)
	
	{
		System.out.println("first no is:"+num1);
		System.out.println("second no is:"+num2);
		int result=num1+num2;
		System.out.println("addition is:"+result);
		
	}
	public static int addition2(int num1, int num2)
	{
		System.out.println("first no is:"+num1);
		System.out.println("second no is:"+num2);
		int res=num1+num2;
		System.out.println("final result"+res);
		return res;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		addition1(10,30);
		//or
		int x=20, y=30;
		//or
		addition1(x,y);
		//or
		int xyz=addition2(10,20);
		int finalresult=xyz/6;
		System.out.println("Answer:"+finalresult);
		
		
		
		
		
		
		
		
	}

}
