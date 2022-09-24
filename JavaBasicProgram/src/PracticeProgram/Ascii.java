package PracticeProgram;

public class Ascii {

	char ch='A';
	int i=ch;
	
	public void asc() {
System.out.println("ASCII value of :"+ch+"="+i);
		
		

		//using for loop
		char capicharacter='A';
		for(int j='A';j<'Z';j++)
		{
			capicharacter++;
			System.out.println(capicharacter+":"+j);
			}
			
			char smallcharacter='a';
			for(int k='a';k<'z';k++) {
			
				smallcharacter++;
				System.out.println(smallcharacter+":"+k);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ascii as = new Ascii();
		as.asc();
		
		char capital='A';
		for(int i='A';i<='Z';i++) {
			capital++;
			System.out.println(capital+":"+i);
		}
	}

}
