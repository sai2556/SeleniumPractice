package Interviewprogram;

public class PalindromeString {

	public static void main(String[] args) {
		String p="Sainath ";
		String rev="";
		for(int i=p.length()-1;i>=0;i--){
			rev=rev+p.charAt(i);
		}
		System.out.println("print string in reverse:"+rev);
		if(p.equals(rev)) {
			System.out.println("Given String is palindrom string");
		}else {
			System.out.println("Given String is  not palindrom string");	
		}

	}

}
