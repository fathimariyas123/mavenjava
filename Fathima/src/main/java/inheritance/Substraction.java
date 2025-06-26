package inheritance;

public class Substraction extends Addition {
	
	public void substraction()
	{
		int difference = num1 - num2;
		System.out.println("the minus of two number is:" +difference);
		
	}

	public static void main(String[] args) {
		Substraction s = new Substraction();
		s.addition(20, 10);
		s.addition();
		s.substraction();
		
		// TODO Auto-generated method stub

	}

}
