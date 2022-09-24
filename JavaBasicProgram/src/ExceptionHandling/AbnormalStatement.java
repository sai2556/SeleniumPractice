package ExceptionHandling;

public class AbnormalStatement {

	public static void main(String[] args) {
	
   		//1.abnormal statement
		int i=10;
		double j=i/0;
		System.out.println(j);// throw arithmeticexception 
		
		//2.abnormal statment
		int []a=new int[5];
		a[5]=30/2;
       System.out.println(a);// show arrayindexoutofboxException
       
       //3.abnormal statement
       String str=null;
       System.out.println(str);//nullpointerException

	}

}
