package StringClass;

final class Immutable{
	final String name;
	final int salary;
	Immutable(String s1,int num){
		name=s1;
		salary=num;
	}
	public String getname() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
}

public class immutableClass {

	public static void main(String[] args) {
		
		Immutable i1=new Immutable("sai",40000);
		 System.out.println(i1.getname());
		 System.out.println(i1.getsalary());
  
		 //to chng varible value create new object
		 
		 Immutable i2=new Immutable("suraj",45000);
		 System.out.println(i2.getname());
		 System.out.println(i2.getsalary());
	}

}
