package abstractionsample2;

public class Bike extends Vehicle {
	public void start()
	{
		System.out.println("Using key and break");
	}

	public static void main(String[] args) {
		Bike B = new Bike();
		B.start();
		B.display();
		// TODO Auto-generated method stub

	}

}
