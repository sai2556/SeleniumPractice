package PracticeProgram;

public class Revision4 {
	 static int x; // static global varible
	double res;
	 static public void display() {//  method with no parameter , datatype void use mens  we can not use retuern value 
		  int p=10,q=20,r=30;
		  double res=p*r*q;
		   System.out.println("p:"+p);
		   System.out.println("q:"+q);
		   System.out.println("r:"+r);
		   System.out.println("final result:"+res);}
		   
	  
	 public double display(int p, int q,int r) {//  method with  parameter , datatype double use mens  we can  use retuern value 
		  // p,q,r are local varible beacuse they declare in method parameter 
		 // varible declare in side the method or in parameter of  method is called as local varible
		  double res=p*r*q;
		   System.out.println("p:"+p);
		   System.out.println("q:"+q);
		   System.out.println("r:"+r);
		   System.out.println("final result:"+res);
		   return res;
		   
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		double salary;
		//System.out.println("Age:"+age); local variable declare and initilize same time 
        System.out.println(" static global varible x:"+Revision4.x);// standard type to acces  x , x should initilize defult value 
        
        // global varible declare but not initilize  and we use this global varible that varible show defualt value  at the time of initilization
	    Revision4 s1=new Revision4();
	    System.out.println("non static global varible res:"+s1.res);// show defult value creating object or instance 
	    
	    
	    // method calling 
	    // if method is satatic we call directly 
	    display();
	     
	    // if method i non static we create object/ instance
	     Revision4 ref1=new Revision4();
	     ref1.display(20,30,40);
	     double x=ref1.display(30,40,50);// use return value
	     double result= x+100;
	     System.out.println("result :"+result);
	     
	     
	    
	    
	    
	
	}
	

}
