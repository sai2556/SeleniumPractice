package PracticeProgram;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int num=8,counter=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				counter++;
			}
		}
		if(counter==2) {
			System.out.println(" Prime Number:"+num);
		}else {
			System.out.println("given number is not prime:"+num);
		}

	}

}
