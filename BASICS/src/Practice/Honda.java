package Practice;

public class Honda extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Honda honda= new Honda();
            honda.run();
            honda.description();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("I have a Honda bike");
	}

}
