package PredefineClasses;
import java.util.Scanner;
public class Stringclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dhanoripune";
		char c=str.charAt(0);
		System.out.println("char at index 0: "+c);
		char a=str.charAt(1);
		System.out.println("char at index 1: "+a);
		
		// to print one by one char of string
		int number=1;
		for(int i=0;i<str.length();i++) {
			System.out.println(number+":"+str.charAt(i));
			number++;
		}
		// to print one by one char of string from last index
		int number1=1;
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(number1+":"+str.charAt(i));
			number1++;
		}
		String temp=" ";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println(str);
		System.out.println(temp);
		System.out.println(reverseString("Dhanoripune"));
		String s1="Bangalore";
		System.out.println(reverseString(s1));
		Scanner scn=new Scanner(System.in);
		String s2;
		System.out.println("Enter String to be reverse");
		s2=scn.next();
		System.out.println("Revrse string is:"+reverseString(s2));
		String s4;
		System.out.println("Enter string to Palindrome");
		s4=scn.next();
		PalinString(s4);
	}
	static String reverseString(String str) {
		String temp=" ";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}return temp;
	}
		static void PalinString(String str) {
			String s3=str;
			String temp=" ";
			for(int i=str.length()-1;i>=0;i--) {
				temp=temp+str.charAt(i);
		}if(temp.equals(s3)) {
			System.out.println("Given String is palindrome string:"+str);
		}else {
			System.out.println("Given string is not palindrome string:"+str);
		}
		

	}

}
