package PracticeProgram;

public class DublicateArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,6,2,3,};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Dublicate element is:"+arr[j]);
				}
			}
		}

	}

}
