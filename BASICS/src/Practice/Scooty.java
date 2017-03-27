package Practice;

public class Scooty extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scooty Scooty= new Scooty();
            Scooty.run();
            Scooty.description();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("I have a Scooty");
	}
}
