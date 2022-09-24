package ArrayPrograming;
import java.util.Arrays;
public class MdCloneArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program of clone Array");
		int Array[]= {33,4,5,8};
		
		for(int a:Array) {
			System.out.println(a);
		}
		System.out.println("Print clone array");
		int clonearry[]=Array.clone();
		for(int a:clonearry) {
			System.out.println(a);
		}
		System.out.println(Arrays.equals(Array, clonearry));
       int copiarry[]=Arrays.copyOf(Array, Array.length);
       for(int a:copiarry) {
    	   System.out.println(a);
       }
       System.out.println("Rang of arry");
       int rangarry[]=Arrays.copyOfRange(Array, 1, 3);
       for(int a:rangarry) {
    	   System.out.println(a);
       }
       Arrays.sort(rangarry);
       for(int a:rangarry) {
    	   System.out.println(a);
       }
	}

}
