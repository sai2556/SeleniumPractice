package Logicaloperator;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating tow variables for age and weight
		int age=18;
		int weight=50;
		if(age>=18)
		{
			System.out.println("candidate age is:"+age);
			
			if(weight>=50) {
				System.out.println("your eligble to donate blood");
			}else {
				System.out.println("you r not eligble to donate blood , your weight is less");
			}
			} else
			{
				System.out.println("your age is less than 18");
				
			}
		
			
		}
			

	}


