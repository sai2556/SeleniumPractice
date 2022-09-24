package ArrayPrograming;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// collection of similer type of element or data type is know as arry 
		// tow types of arry 1 single dimension arry 2. multidimension arry
		// Example of single dimension arry
		
		/*int a=10,b=20,c=30; // simple inialization
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);*/
		
		          // using aary
		 
		int a[] =new int[3];// a,b,c // index start with 0
		System.out.println(a[0]);// show default value 0
		System.out.println(a[1]);// show default value 0
		System.out.println(a[2]);// show deafult value 0
		
		// to upadte the value
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		System.out.println(a[0]);// 100
		System.out.println(a[1]);// 200
		System.out.println(a[2]);// 300
		
		// to find arry element lenght 
		System.out.println("arry element count: "+a.length);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		// use for each loop
		
		for(int number:a) {
			System.out.println(number);
			
		}
		
		int age[]=new int[] {10,20,40,50};
		for(int num:age) {
			System.out.println(num);
		}
		
		
		
		
		// arry syntax = datatype[] arryname or datatype []arryname or datatype arryname[]; for declartion
		// arryname=new datatype[size]; allocate memory
		// datatype[] arryname=new datatype[size];
		
		
		
		
		

	}

}
