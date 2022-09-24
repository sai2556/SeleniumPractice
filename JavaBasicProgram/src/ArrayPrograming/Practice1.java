package ArrayPrograming;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3,4,5};
		int []arr2=new int[arr1.length];
		arr2=arr1;
		System.out.println("orignal element ");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+ " ");}
			System.out.println(" copy  element ");
			for(int i=0;i<arr2.length;i++) {
				System.out.println(arr2[i]+" ");
			}
       int []ary= {2,5,4,7};
       int []copyto=Arrays.copyOf(ary, ary.length);
       for(int i=0;i<copyto.length;i++) {
    	   System.out.println("copyto Arry:"+copyto[i]);
       }
	}
	}


