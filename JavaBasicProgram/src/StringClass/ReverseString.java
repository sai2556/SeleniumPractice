package StringClass;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Program Start");
		
	  String s1="Basicjava";
	  System.out.println("s1="+s1);
	  
	  //get length 
	  System.out.println("String s1 length ="+s1.length());
	  
	  String temp="";
	  for(int i=s1.length()-1;i>=0;i--) {
		  temp=temp+s1.charAt(i);
	  }
	  System.out.println("Reverse s1 String="+temp);
	  reversstring(s1);
	 
	}
	// creating method 
	 static String reversstring(String s1) {
		 String temp="";
		  for(int i=s1.length()-1;i>=0;i--) {
			  temp=temp+s1.charAt(i);
		  }
		  return temp;
	  }

}
