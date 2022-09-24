package PracticeProgram;
import java.util.Scanner;
class l{
	int age=20,salary=30;
	double result=age*salary;
	 
	
}class b extends l{
	int a=10;
	double m=25.36;
}class c extends b{
	int p=30;
}
interface display{
	int num=30;
}interface show{
	int num2=50;
	
}class result implements display,show{
	int num3=80;
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      c ref=new c();
      System.out.println("print age:"+ref.age);
      result ref2=new result();
      System.out.println("print :"+ref2.num);
      
      Scanner scn=new Scanner(System.in);
      int age1;
      boolean valid;
      String character;
      double salary2;
      System.out.println("Enter age1");
      age1=scn.nextInt();
      System.out.println("Enter Valid");
      valid=scn.nextBoolean();
      System.out.println("print character");
      character=scn.next();
      System.out.println("print salary2");
      salary2=scn.nextDouble();
      
	}

}
