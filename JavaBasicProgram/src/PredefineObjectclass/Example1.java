package PredefineObjectclass;

class Demo{

	

	@ Override
	public String toString() {
	   return "i am tostring ";
		
	}
	
}
public class Example1 extends Demo {
	static int lastroll=100;
	int rollno;
	Example1()
	{
		rollno=lastroll;
		lastroll++;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		System.out.println(d1);// predefineobjectclass.demo@7852e922
		System.out.println(d1.toString());//predefineobjectclass.demo@7852e922
		
		Demo d2=new Demo();
		System.out.println(d2);
		System.out.println(d2.hashCode());
		Example1 s1=new Example1();
		System.out.println(s1);// s1.toString() represent fullyqualifiedclassname@hexadecimaladdress
		System.out.println(s1.toString());// write explicitly 
		System.out.println("check d1 and d2 a:"+d1.equals(d2));
		System.out.println(s1.hashCode());// convert hexadecimal into interger number
		
		
		

	}

}
