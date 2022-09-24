package PredefineClasses;

public class StringBufferclass {

	public static void main(String[] args) {
     // Mutable class 
		
		StringBuffer sb=new StringBuffer("Hello sir ");
		System.out.println(sb);
		sb.append("My name is sainath");
		System.out.println(sb);
		sb.insert(5," Mr");
		System.out.println(sb);
		sb.replace(6, 8, "Madam");
		System.out.println(sb);
		sb.delete(6, 8);
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Pune is old city");
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("");
		System.out.println(sb2.capacity());
		sb2.append("Mumbai ");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		sb2.append("is capitabl  of MH");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println("********equal*******");
		StringBuffer sb3=new StringBuffer("hello java");
		System.out.println(sb3);
		StringBuffer sb4=new StringBuffer("hello java");
		System.out.println(sb4);
		System.out.println("compare:"+sb3.equals(sb4));// false beause Stingbuffer does not support on value basis
		System.out.println("compare:"+((sb3.toString().equals(sb4.toString())))); //convert tostring then compare bufferstring on value basis
		 
		// String class 
		String s1="I am from pune, work in tata motors";
		System.out.println(s1);
		String[] arr=s1.split("");
		for(String a:arr) {
		System.out.println(a);
		} 
		String s2="i am from beed";
		System.out.println(s2);
		String[] arr1=s2.split("",2);
		for(String b:arr1) {
			System.out.println(b);
		
		}
		String s3="   sai  kale  ";
		System.out.println(s3);
		System.out.println("length with space:"+s3.length());
		System.out.println("length without space:"+s3.trim());
		System.out.println(s3.trim().length());// starting and ending trim karta
		
		String s4="java basic";
		System.out.println(s4);
		System.out.println("convert uppercase:"+s4.toUpperCase());
		
		String s5="ABCDE";
		System.out.println(s5);
		System.out.println("convert lower case:"+s5.toLowerCase());
		
		String s6="CoreJava";
		System.out.println(s6);
		System.out.println("print on index no:"+s6.charAt(4));
		System.out.println(s6.substring(1));
		System.out.println(s6.substring(1,3));
		
		System.out.println("concate:"+s4.concat(s6));
		
		String s7="sainath"+123;
		System.out.println(s7);
		
		
	
		
	 
	}
}
