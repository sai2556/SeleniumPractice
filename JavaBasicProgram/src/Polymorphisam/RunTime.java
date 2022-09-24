package Polymorphisam;

class vehicle{
	void run() {
		System.out.println("vehicle is moving");
	}
}
class car extends vehicle{
	void run() {
		System.out.println("car is running");
	}
}
class cycle extends vehicle{      // inheritance
	void run() {
		System.out.println("Atlas cycle");
	}
}
public class RunTime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        car c1=new car();
        c1.run();
        vehicle v1=new cycle();// upcasting 
        v1.run();
	}

}
// runtime polymorphisam acchived through method overriding ,inheritance and upcasting 
