package Inheritance;

public class RevrseWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5423,rem, rev=0;
		while(no!=0) {
		 rem=no%10;
		 rev=rev*10+rem;
		 no=no/10;
			
		}
		System.out.println("print reverse:"+rev);

	}

}
