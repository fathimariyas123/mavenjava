package abstractionsample2;

public class Car extends Vehicle {
	public void start()
	{
		System.out.println("Using key and clatch");
	}

	public static void main(String[] args) {
		Car C = new Car();
		C.start();
		C.display();
		// TODO Auto-generated method stub

	}

}
