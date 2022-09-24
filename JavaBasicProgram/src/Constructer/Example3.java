package Constructer;
class cons1{
	cons1(){
		System.out.println("deafualt constractor");
	}
	cons1(int a){
		System.out.println("single parameter constractor"+a);
		
	}
	cons1(int a, int b){
		System.out.println("int int parameter constractor"+a+""+b);
		
	}cons1(int a, double y){
		System.out.println("int double parameter const"+a+""+y);
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons1 s1=new cons1();
		cons1 s2=new cons1(20);
		cons1 s3=new cons1(10,20);
		cons1 s4=new cons1(10,30.1);
		

	}

}
