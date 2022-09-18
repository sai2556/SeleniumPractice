package ArrayPrograming;

public class Multidimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] []arr=new int[3] [3];
        System.out.println("arry element count:"+arr.length);
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		System.out.print(arr[i][j] +" ");
        	}
        	System.out.println();
        }
        
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        for(int i=0;i<arr.length;i++) {// get row count
        	for(int j=0;j<arr[i].length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        char [][]charary= {{'A','B','C'},{'D','E','F'}};
        System.out.println(charary.length);
        for(int i=0;i<charary.length;i++) {
        	for(int j=0;j<charary[i].length;j++) {
        		System.out.print(charary[i][j]+" ");
        	}
        	System.out.println();
        }
        
	}

}
