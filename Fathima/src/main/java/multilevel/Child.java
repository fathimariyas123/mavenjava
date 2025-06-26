package multilevel;

public class Child extends Parent {
	public void child()
	{
		System.out.println("this is a child class");
	}

	public static void main(String[] args) {
		
		Child C = new Child();
		C.grandParent();
		C.child();
		C.parent();

	}

}
