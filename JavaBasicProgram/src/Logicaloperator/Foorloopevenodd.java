package Logicaloperator;

public class Foorloopevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****print 1 to 50 odd number");
		for(int i=0;i<50;i++) {
			if(!(i%2==0)) {
				System.out.println(i);
			}
		}
			System.out.println("****print 1 to 100 even number");
			for(int i=0;i<=100;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
		}
			System.out.println("*****print 100 to 50 odd number ****");
			for(int i=100;i>=50;i--) {
				if(!(i%2==0)) {
					System.out.println("i:"+i);
				}
			}
			for(int i=0;i>0;i++) {
				if((i%2==0)) {
					System.out.println(i);
				}
			}

	}

}
