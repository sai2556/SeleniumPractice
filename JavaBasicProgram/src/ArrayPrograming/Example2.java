package ArrayPrograming;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String[] car=new String[4];
		car[0]="BMW";
		car[1]="Audi";
		car[2]="skoda";
		car[3]="honda";
		System.out.println(car[0]);
		System.out.println(car[1]);
		System.out.println(car[2]);
		System.out.println(car[3]);*/
		
	   String[] car= {"BMW","Audi","skoda","Honda"};
		
		System.out.println("chang the element of arry 0");
		car[0]="skoda";
		System.out.println(car[0]);
		System.out.println("count of the length");
		System.out.println(car.length);
		
		System.out.println("Use for loop");
		for(int i=0;i<car.length;i++) {
			System.out.println(car[i]);
			
		}
		System.out.println("using for each loop");
		for(String a:car) {
			System.out.println(a);
			
		}
		
	
		
		
		
		

	}

}
