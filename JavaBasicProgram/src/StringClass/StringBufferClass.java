package StringClass;

public class StringBufferClass {

	public static void main(String[] args) {
		System.out.println("Program Start");
		
		StringBuffer sb=new StringBuffer("Sai");
		
		System.out.println("orignal string;"+sb);
		
		// to  add string  use append method
		sb.append("kale");
		System.out.println(" after chang:"+sb);
		
		//to reverse string 
		sb.reverse();
	   System.out.println("reverse string :"+sb);
	   
	   //to replace 
	   sb.replace(2, 5, "AAAA");
	   System.out.println("replace string:"+sb);
	   
	   //to delete
	   sb.delete(2, 5);
	   System.out.println("delete:"+sb);
	   
	   StringBuffer sb1=new StringBuffer();
	   System.out.println("default length:"+sb1);
	   sb1.append("my name is sai");
	   System.out.println("print:"+sb1);
	   System.out.println("lenth:"+sb1.capacity());// show16
	   
	   sb1.append(" i am basicaly from beed");
	   System.out.println("check length:"+sb1.capacity());
	   
	   sb1.append(" i have done my graduation from aurangabad");
	   System.out.println("check length:"+sb1.capacity());
	   
	   System.out.println(sb1);
	
	}
	

}
