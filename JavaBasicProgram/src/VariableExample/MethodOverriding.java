package VariableExample;

public class MethodOverriding {
	 void method1() {// method overloding : any method declare more than one in class body having smae name but diffrent in parameter
	   double p=22/7;
	   int r=5;
	   double res=p*r*r;
	   System.out.println("pie value:"+p);
	   System.out.println("radius value:"+r);
	   System.out.println("result:"+res);
	 }
	   
	   void method1(int r,float p) {
		   double res=p*r*r;
		   System.out.println("pie value:"+p);
		   System.out.println("radius value:"+r);
		   System.out.println("result:"+res);
		     }
	     double method1(int r,double p) {
	    	 double res=p*r*r;
	    	 System.out.println("pie value:"+p);
			   System.out.println("radius value:"+r);
			   System.out.println("result:"+res);
	    	 return res;
	    	 
	     }
	    
	   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding ref=new MethodOverriding();
		ref.method1();
		ref.method1(7,22/7f);
		
		ref.method1(14,22/7);
		

	}

}
