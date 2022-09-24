package PredefineClasses;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   StringClass A1=new StringClass();
	   System.out.println("A1: "+A1);
	   
	   String s1="Mumbai";// using liiter object create in string constant pool area
	   String s2="Mumbai";//s2 will point to s1 object  no new object will be creat
	   String s3="Pune"; // new object wiil be create in strinng constant pool 
	   
	   System.out.println("s1: "+s1);// tostring() overrided
	   System.out.println("s2: "+s2);
	   System.out.println("s3: "+s3);
	   System.out.println("s1 char count:"+s1.length());
	   System.out.println("s2 char count: "+s2.length());
	   System.out.println("s3 char count: "+s3.length());
	   System.out.println("s1 & s2 using .equal():"+s1.equals(s2));//  inside string compare tow object based on value s1=mumbai,s2=mumbai show true 
	   System.out.println("s1 & s2 using '==':"+(s1==s2)); // inside string compare tow object based on address true
	   String s4=new String("Beed"); // tow object create 1.string constant pool 2. non constant pool
	   System.out.println("s4: "+s4);
	   System.out.println("s4 char count:"+s4.length());
	   System.out.println("s1 & s4 using .equals():"+s1.equals(s4));	// false
	   System.out.println("s1 & s4 using '==':"+(s1==s4));// false
	   }

}
