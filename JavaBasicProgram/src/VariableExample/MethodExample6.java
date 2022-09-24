package VariableExample;

public class MethodExample6 {
	public static double getROi(int p, int t, float r)
		{
		 
 	  System.out.println("principle is :"+p);
			 System.out.println("time is:"+t);
			 System.out.println("rate of interst is :"+r);
			 double res2=p*t*r/100;
			 System.out.println("smiple itrest is :"+res2);
			 return res2;
			 }
		

	public static void main(String[] args) {
	double x=getROi(100,5,2.5f);
	double finalamount=1000+x;
	System.out.println("total:"+finalamount);
		// TODO Auto-generated method stub

	}

}
