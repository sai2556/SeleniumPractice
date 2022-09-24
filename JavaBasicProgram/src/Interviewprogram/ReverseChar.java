package Interviewprogram;

public class ReverseChar {

	public static void main(String[] args) {
     // reverse char using string nd reverse integer value

	/*	 String s="sainath";
		 String rev="";
		 for(int i=s.length()-1;i>=0;i--) {
			 rev=rev+s.charAt(i);
		 }
		 System.out.println("Print  reverse name:"+rev);
		 
	}*/
	
		
	String v="1,5,5,6,9,8";
	String rev="";
	for(int i=v.length()-1;i>=0;i--) {  // value.length()=7-1=6  index value =6   then revrse to 6 ,5,4,3,2,1,0 and print
		rev=rev+v.charAt(i);
	}
	System.out.println(rev);

}
}