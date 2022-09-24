package Operators;

public class UnaryExample3 {

	public static void main(String[] args) {
	   int a=0,b;
	   b=++a + ++a + a++ + a--;
	   System.out.println("b:"+b);
	   System.out.println("a:"+a);
	   
	   a=20;
	   b=++a + --a + a++ + a--;
	   System.out.println("b:"+b);
	   System.out.println("a:"+a);
	   
	 
	   
	}

}
