package PredefineClasses;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s2=new String("MoM");  // reverse program
		System.out.println(s2);
		for(int k=0;k<s2.length();k++) {
			System.out.println(s2.charAt(k));
		}
		for(int p=s2.length()-1;p>=0;p--) {
			System.out.println(s2.charAt(p));
		}
		System.out.println("*******Remove space ***");
	String s3="  i am from beed  ";
	System.out.println(s3);
	s3=s3.replaceAll("\\s", "");
	System.out.println(s3);
	
	String s="Sainath";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	

		
			
	
	
	
		
		
		
		String s1="I am sainth";
		
		System.out.println(s1);
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
			
		
		}
		System.out.println(" "+reverse(s1));
		}
		static String reverse(String str ) {
		String temp=" ";
		for(int j=str.length()-1;j>=0;j--) {
			temp=temp+str.charAt(j);
		}
		return temp;
		
		
		}
		
	
		}
