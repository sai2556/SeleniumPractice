package ExceptionHandling;

public class HandleExecptionTryCatch {

	public static void main(String[] args) {
		
		int i=20;
		try {
			double j=i/0;
		}
	     catch(ArithmeticException e){
	    	 
	    	 System.out.println("Catch block  is executed");
	    	 
	     }
		int a[]=new int[5];
		try {
			a[5]=30;
		}
		catch(Throwable k) { // when we dont know about whhich Exception is occur then we use Throwable 
			
			System.out.println(k);
		}
		
		try {
			String str=null;
			System.out.println(str.length());
		}
		catch(ArithmeticException l) {
			System.out.println(l);
		}
		catch(ArrayIndexOutOfBoundsException p) {
			System.out.println(p);
		}
		catch(Throwable t) {
			System.out.println(t);
		}
		

	}

}
