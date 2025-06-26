package inheritance;

public class  Child  extends Parent
{
	public void child()
	{
		System.out.println("This is a child class");
	}
public static void main(String args[])
{
	Child c = new Child();
	c.parent();
	c.child();
	c.grandParent();
}
}
