package ExceptionHandling;

public class TrycatchFinallyBlock {

	public static void main(String[] args) {
		
/*		double salary=10000/0;
		System.out.println(salary);// show uncheckedException  */

		try {
			double salary=1000/0;
			System.out.println(salary);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NullPointerException k) {
			System.out.println(k);
		}
		finally {
			System.out.println("finally block always executed");
		}
	}

}
