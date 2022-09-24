package Logicaloperator;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(initilization;condition;inre/decr){
		 * statement or code executed
		 *}
		 * 
		 * 
		 * */
		System.out.println("******for loop*****");
		for(int i=0;i<5;++i) {
			System.out.println("i:"+i);
		}
		System.out.println("***printing 0 to 10*****");
		for(int i=0;i<11;++i) {
			System.out.println("i:"+i);
		}
		System.out.println("****printing 10 to 0***");
		for(int i=10;i>0;i--) {
			System.out.println("i:"+i);}
			System.out.println("****print 50 to 100");
			for(int i=50;i<101;++i) {
				System.out.println("i:"+i);
			}
			System.out.println("***print A to Z*****");
			for(char i='A';i<='Z';++i) {
				System.out.println("i:"+i);
			}
			System.out.println("****print z to a***");
			for(char al='Z';al>='A';al--) {
				System.out.println(al);
			}
		

	}

}
