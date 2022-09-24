package PracticeProgram;

public class ForloopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******Display a text in 5 times*****");
		for(int i=0;i<5;i++) {
			System.out.println("Sainath");
		}
		System.out.println("****display 1 to 5 number");
		for(int i=1;i<=5;i++) {
			System.out.println("Display :"+i);
		}
		System.out.println("Display Uppercase alphabet");
		for(char i='A';i<='Z';i++) {
			System.out.println("Uppercase Alphabet: "+i);
			System.out.println("Display Lowercase alphabet");
			for(char j='a';j<='z';j++) {
				System.out.println("Display Lowercase alphabet: "+j);
			}
			
		}
	int number=12345,reverse=0;
	for(;number!=0;number=number/10) {
		int remainder1=number%10;
		reverse=reverse*10+remainder1;
		System.out.println(reverse);
	}
	
	
	


	}

}
