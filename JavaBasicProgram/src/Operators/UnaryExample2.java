package Operators;

public class UnaryExample2 {

	public static void main(String[] args) {
		int a=78,b;
		b=++a;//b=79,a=79
		int x=a,y;//x=79
		System.out.println(x);
		 y= ++x;// y=80,x=80
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
		int p=10,q=20,res;
		res= ++p + --q;
		System.out.println("res:"+res);//11+19=30
		System.out.println("p:"+p);//print updated vlaue of p=11
		System.out.println("q:"+q);//print updated value of q=19
		
		int res1= p++ - q--;
		System.out.println("res1:"+res1);//11-19=-8
		System.out.println("p:"+p);//print updated value p=12
		System.out.println("q"+q);//print updated value q=18
		
		int res2= ++p + --q;
		System.out.println("res2:"+res2);
		System.out.println("p:"+p);
		System.out.println("q"+q);
		
		
		
		

	}

}
