package PracticeProgram;

public class Ifelseassignment {
	static void checkvc(char ch) {
	if(ch=='a') {
		System.out.println("given char is vowel");
		}
	else if(ch=='e') {
		System.out.println("given char is vowel");
		}
	else if(ch=='i') {
		System.out.println("given char is vowel");
	}else if(ch=='o') {
		System.out.println("given char is vowel");
	}
	else if(ch=='u') {
		System.out.println("given char is vowel");
	}else {
		System.out.println("given char is consonant");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=47;
		System.out.println("num: "+num);
		if(num%2==0) {
			System.out.println("Num is even number");
			
		}else {
			System.out.println("Num is odd number");
			
		}
		
	Ifelseassignment.checkvc('d');
		System.out.println("*****Check alphabet is vowel or consonant*********");
		
		char ch='p';
		if(ch=='a') {
			System.out.println("given char is vowel");
			}
		else if(ch=='e') {
			System.out.println("given char is vowel");
			}
		else if(ch=='i') {
			System.out.println("given char is vowel");
		}else if(ch=='o') {
			System.out.println("given char is vowel");
		}
		else if(ch=='u') {
			System.out.println("given char is vowel");
		}else {
			System.out.println("given char is consonant");
		}
		System.out.println("***find largest number *****");
		int m=20,n=50,o=70;
		if(m>=n&&m>=o) {
			System.out.println("M is largest number: "+m);
		}else if(n>=m&&n>=o) {
			System.out.println("N is largest number: "+n);
		}else if(o>=m&&o>=n) {
			System.out.println("O is largest number: "+o);
		}else {
			System.out.println("number is not largest");
		}
		
		System.out.println("*****program to check number is positive or  negative");
		int k=5;
		if(k>0) {
			System.out.println("Given number is positive");
		}else if(k<0) {
			System.out.println("Given number is negative");
		}else {
			System.out.println("Given number is  equal to 0");
		}

	}

}
