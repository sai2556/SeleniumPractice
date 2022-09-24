package Logicaloperator;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=5;
       int ct=0;
       for(int i=1;i<=10;i++) {
    	   if(num%i==0) {
    		   ct++;
    	   }
    		   
       }
       if (ct==2) {
    	   System.out.println("prime no ");
       }else {
    	   System.out.println("number is not prime");
       }
       
	}

}
