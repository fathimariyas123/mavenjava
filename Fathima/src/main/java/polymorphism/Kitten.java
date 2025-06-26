package polymorphism;

public class Kitten extends Cat {

	public void activity()
	{
		System.out.println("eating time");
	}
 public void Arithemtic(int a ,int b)
 {
	 int sub = a - b;
	 System.out.println("Difference :" +sub);
 }
	public static void main(String[] args) {
        Cat C1 = new Cat();
        C1.Arithemtic(20, 10);
		Cat C = new Kitten();
		C.Arithemtic(20, 10);
		// TODO Auto-generated method stub

	}

}
