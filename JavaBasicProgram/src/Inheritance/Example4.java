package Inheritance;
class sansad{
	// defult constrctor
	public void member() {
		System.out.println("Rajysabha + loksabha");
	}
}class loksabha extends sansad{
	// defult constrctor with defult super()
	public void member1() {
		System.out.println("MP");
	}
}class rajysabha extends sansad{
	//defult constructor with defult super()
	public void member2() {
		System.out.println("rajy sabha mp");
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loksabha re=new loksabha();
		re.member();
		re.member1();
		rajysabha ref=new rajysabha();
		ref.member2();
		ref.member();

	}

}
