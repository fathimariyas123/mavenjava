package hirerarchical;

public class Child2 extends Parent{
	public void child2()
	{
		System.out.println("Child2 class");
	}

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.child2();
		c.parent();
	}

}
