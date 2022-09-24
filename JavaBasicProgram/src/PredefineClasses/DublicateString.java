package PredefineClasses;

public class DublicateString {

	public static void main(String[] args) {
	//	System.out.println("Find dublicate string");
	    char[] a=new char[] {'s','a','i','n','a','t','h'};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j]) && (i!=j)){
					System.out.println( "Duplicate element is:"+a[j]+"");
				}
			}
		}

	}

}
