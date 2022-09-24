package VariableExample;

public class MethodExample5 {
        static void method1()
        {
        	int p=1000, t=5;
        	float r=4.5f;
        	System.out.println("principle is:"+p);
        	System.out.println("time is"+t);
        	 System.out.println("rate of inntrest is:"+r);
        	double res=p*t*r/100;
        	System.out.println("simple intrest is:"+res);
        }
              static double method2(int p, int t, float r)
        		{
            	  System.out.println("principle is :"+p);
        			 System.out.println("time is:"+t);
        			 System.out.println("rate of interst is :"+r);
        			 double res2=p*t*r/100;
        			 System.out.println("smiple itrest is :"+res2);
        			 return res2;
        		
        		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	method1();
		 System.out.println("************************");
		method2(100,5,3.5f);
		 
		 
		 
		 
	}

}
