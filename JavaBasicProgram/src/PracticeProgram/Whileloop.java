package PracticeProgram;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		while(ch<='z') {
			System.out.println(ch+" ");
			ch++;
		}
		char ch1='A';
		while(ch1<='Z') {
			System.out.println(ch1+" ");
			ch1++;
		}
		
		int a=20;
		System.out.println("a: "+a);
		a=30;
		System.out.println("a: "+a);
		final int k=50;
		System.out.println("k: "+k);
		//k=40;// whenever we declare any variable as a final then we can not chang varible value
		int c=-1;
		do {
			System.out.println("Print all the number from 10 to till 1 ");
			System.out.println(c);
			--c;
			
		}while(c<0);

	}

}
