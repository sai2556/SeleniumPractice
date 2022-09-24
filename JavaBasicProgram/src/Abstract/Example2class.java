package Abstract;
 abstract class School{
	 abstract void name();
	 abstract void rollnumber();
	 abstract void addres();
	 
 }
 class student extends School{
	 void name() {
		 System.out.println(" mohan ");
	 }
	 void rollnumber() {
		 System.out.println("100");
	 }
	 void addres() {
		 System.out.println("sanjay nagar");
	 }
 }
	 class Staff extends School{
		 void name() {
			 System.out.println(" akshay ");
		 }
		 void rollnumber() {
			 System.out.println("1");
		 }
		 void addres() {
			 System.out.println("gajanan nagar");
		 }
		 
	 }
 
public class Example2class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       student r1=new student();
       r1.name();
       Staff r2=new Staff();
       r2.addres();
	}

}
