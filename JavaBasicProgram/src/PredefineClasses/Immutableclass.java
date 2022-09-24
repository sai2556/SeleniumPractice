package PredefineClasses;

final class Immutable{  // class has final 
	 final int salary;  // declare data as a final 
	 final String name;
	 Immutable(int a,String b){
		 salary=a;
		 name=b;       // initilize data in constructor we can initilize final varible in constrctor
	  }
	 public String getname() {   // create getmethod in class
		 return name;
	 }
	 public int getsalary() {
		 return salary;
	 }
}

final class Abc{
	final String name;
	final double value;
	Abc(String d1,double d2){
		name=d1;
		value=d2;
	}
	public String getname() {
		return name;
	}
	public double getvalue(){
		return value;
	}

}

public class Immutableclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Immutable s1=new Immutable(250,"sai");
          System.out.println(s1.getname());
          System.out.println(s1.getsalary());
          
          Immutable s2=new Immutable(300,"kale");
          System.out.println(s2.getname());
          System.out.println(s2.getsalary());
          
          Abc s3=new Abc("java",12345);
          System.out.println(s3.getname());
	}

}
