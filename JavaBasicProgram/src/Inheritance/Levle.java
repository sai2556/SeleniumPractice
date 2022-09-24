package Inheritance;
class Car{// parent class
	Car(){
		System.out.println("BMW car");
	}
	public void Avrage(){
		System.out.println("30");
	}
}class bike extends Car{
	bike(){// chail class
		System.out.println("bullet");
	}
	public void avrage2() {
		System.out.println("40");
	}
	
}

public class Levle {

	public static void main(String[] args) {
		bike ref=new bike();
		ref.Avrage();
		ref.avrage2();
		// TODO Auto-generated method stub

	}

}
