package Operators;

public class UnaryOperator {

	public static void main(String[] args) {
		int a=10;
		int b=a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		// pre icrmental unary: first perform operation then use updated value ++a
		//post incremental unary:first  use the value then perform operation a++
		
		int k=++a;
		System.out.println("k:"+k);
		System.out.println("a:"+a);
		
		int j=k++;
		System.out.println("j:"+j);
		System.out.println("k:"+k);
		
		//pre decrement unary: first perform operation then use updated value --a  
		//post decrement unary: first use the value then perform operation a--
		
		int l=--j;
		System.out.println("l:"+l);//11-1=10 then use value 
		System.out.println("j:"+j);//10
		
		int r=l--;
		System.out.println("r:"+r);
		System.out.println("l:"+l);
		
		int m=105;
		System.out.println("m:"+ ++m);
		System.out.println("m:"+m);
		
		int z=100;
		System.out.println("z:"+ z++);
		System.out.println("z:"+z);
		
		int d=95;
		System.out.println("d:"+ --d);
		System.out.println("d:"+d);
		
		double f=89;
		System.out.println("f:"+ f--);
		System.out.println("f:"+f);
		System.out.println("f:"+ --f);
		System.out.println("f:"+f);
		
		
		
		
		
		

	}

}
