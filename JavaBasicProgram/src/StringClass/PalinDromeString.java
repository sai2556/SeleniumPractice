package StringClass;

public class PalinDromeString {

	public static void main(String[] args) {
		
		System.out.println("Program Start");
	    
		
		String str="CIRIC";
		System.out.println(" String str="+str);
		
		//get length of string
		System.out.println("length of str string="+str.length());
		
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println("temp string="+temp);
		
		if(str.equals(temp)) {
			System.out.println("Given String is palindrome string="+str);
		}
		else {
			System.out.println("Given String is not palindrome string="+str);
		}
		Palindrome(str);
		}
	// create method for palindrome
	static void Palindrome(String str) {
		String s1=str;
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println("temp string="+temp);
		
		if(str.equals(s1)) {
			System.out.println("Given String is palindrome string="+str);
		}
		else {
			System.out.println("Given String is not palindrome string="+str);
		}
	}
	

}
