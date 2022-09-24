package ArrayPrograming;
import java.util.Arrays;

public class M_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char[] copyfrom= {'d','e','c','a','f','e','n','a','t'};
     char[] copyTo=Arrays.copyOf(copyfrom,copyfrom.length);
     for(int i=0;i<copyTo.length;i++) {
    	 System.out.println(copyTo[i]);
     }
     System.out.println("copy with rang");
     char[] copywithrang=Arrays.copyOfRange(copyfrom,3, 5);
     for(int i=0;i<copywithrang.length;i++) {
    	 System.out.println(copywithrang[i]);
    	 for(char b:copywithrang) {
    		 System.out.println(b);
    	 }
     }
     Arrays.sort(copywithrang);
     for(char a:copywithrang) {
    	 System.out.println(a);
     }
     System.out.println("copy");
     int[] xyz= {10,20,30,40,50,60,70,80,90};
     int[] abc=Arrays.copyOf(xyz, xyz.length);
     for(int k:abc) {
    	 System.out.println(k);
     }
     System.out.println("****copy using rang****");
     int[] rang=Arrays.copyOfRange(xyz,3, xyz.length);
     for(int i=0;i<rang.length;i++) {
    	 System.out.println(rang[i]);
     }
     System.out.println("***sort the arry****");
     Arrays.sort(rang);
     for(int p:rang) {
    	 System.out.println(p);
     }
	}

}
