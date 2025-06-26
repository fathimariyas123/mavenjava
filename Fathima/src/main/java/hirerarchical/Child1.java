package hirerarchical;

public class Child1 extends Parent {
	public void child1()
	{
		System.out.println("Child1 class");
	}

	public static void main(String[] args) {
		Child1 C = new Child1();
	    C.child1();
	    C.parent();

	}

}
