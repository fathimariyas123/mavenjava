package multilevel;

public class Parent extends Grandparent
{
	public void parent()
	{
		System.out.println("this is a parent class");
	}
	public static void main(String args[])
	{
	    Parent P = new Parent();
		P.grandParent();
		P.parent();
	}

	

}
