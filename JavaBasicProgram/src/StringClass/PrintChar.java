package StringClass;

public class PrintChar {

	public static void main(String[] args) {
		
		String str="BasicJava";
		// get length of string 
		System.out.println("length of String:"+str.length());
		
		// print one by one chr string 
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}

		//print one by one chr string from last index
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println("last index:"+str.charAt(i));
		}
		
	}

}
