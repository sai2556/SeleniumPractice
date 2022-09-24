package ArrayPrograming;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr=new int[5];// int []arr={10,20,30,40,50};
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println("Count of arry length:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("using for each loop");
		for(int b:arr) {
			System.out.println(b);
		}
		System.out.println("Single Dimension arry");
		String[] ref=new String[3];
		ref[0]="sainth";
		ref[1]="madhavro";
		ref[2]="kale";
		System.out.println("arry count:"+ref.length);
		for(String a:ref) {
			System.out.println(a);
		}
		System.out.println("Multidimension Arry");
		int [][]alph = new int[4][4];
		alph[0][0]=50;
		alph[0][1]=100;
		System.out.println(alph.length);
		for(int i=0;i<alph.length;i++) {
			for(int j=0;j<alph[i].length;j++) {
				System.out.print(alph[i][j]+" ");
			}
			System.out.println();
			}
		}
		
		
	}

	   
	        
	


