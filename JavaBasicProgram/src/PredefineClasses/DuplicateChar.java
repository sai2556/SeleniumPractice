package PredefineClasses;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="buter muter";
		System.out.println("Duplicate character");
	    int counter;
		System.out.println(str);
		// convert string to chararry
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			   
			for(int  j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j] ) {
			
					System.out.println( ":"+arr[j]);
					
					
					
				}
				
			}
		}
		String str1="picture perfect";
		System.out.println(str1);

		int[] freq=new int[str1.length()];
		System.out.println( freq);
        
		char []String=str1.toCharArray();
		System.out.println( String);
		for(int i=0;i<str1.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<str1.length();j++) {
				if(String[i]==String[j]) {
					freq[i]++;
					String[i]='0';
					
					
				}
			}
		}
		System.out.println("charctor and their coressponding freq");
		for(int i=0;i<freq.length;i++) {
			if(String[i]!='0' && String[i]!='0')
				System.out.println(String[i]+"-"+freq[i]);
			
				
		}
		
		
	}

}
