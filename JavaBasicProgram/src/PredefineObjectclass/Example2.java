package PredefineObjectclass;
class Test{
	void display() {
		System.out.println("i am display method");
	}
	int call() {
		int []ref= {10,20,30};
		int res=ref[0]+ref[1]+ref[2];
		System.out.println("print the result:"+res);
		return res;
		
		
	}
	@ Override
	public String toString(){
		return "I am override to string";
	}
	@ Override
	 public int hashCode() {
		return 101;
	}
	
}

public class Example2 extends Test {
	void display() {
		System.out.println("i  am Example class dispaly method");
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Test p1=new Test();
	System.out.println(p1);
	System.out.println(p1.toString());
	System.out.println(p1.hashCode());
	
	Test p2=new Test();
	System.out.println(p2);
	System.out.println(p2.toString());
	System.out.println(p2.hashCode());
	
	System.out.println("check p1 and p2 object are eual or not: "+p1.equals(p2));// check addres same or not 
	
	
	

	}

}
