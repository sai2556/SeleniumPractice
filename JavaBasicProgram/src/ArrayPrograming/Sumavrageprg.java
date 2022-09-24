package ArrayPrograming;

public class Sumavrageprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []number= {10,75,2,8,6,4};
		double sum=0;
		double avrage;
		
		for(int numbers:number) {
			sum = sum + numbers;
			
			
		}int aarylength= number.length;
		avrage=sum / aarylength;
		System.out.println("sum:"+sum);
		System.out.println("avarage:"+avrage);
		

	}

}
