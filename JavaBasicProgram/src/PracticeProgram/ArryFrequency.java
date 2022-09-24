package PracticeProgram;
import java.util.Scanner;

class Frequency{
	int a[]=new int[10];
	int key;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Enter Number");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Number to finde Frequency");
		key=sc.nextInt();
	}
	void count() {
		int count=0;
		
		for(int i=0;i<10;i++) {
			if(a[i]==key) {
			count=count+1;
			}
			System.out.println("Frequency:"+count);
				
		}
		
	}
}

public class ArryFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Frequency b=new Frequency();
       b.getdata();
       b.count();
	}

}
