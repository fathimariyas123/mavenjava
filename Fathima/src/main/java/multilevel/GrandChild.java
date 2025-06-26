package multilevel;

public class GrandChild extends Child {
	public void grandChild()
	{
		System.out.println("This is a grandchild class");
	}

	public static void main(String[] args) {
	GrandChild G = new GrandChild();
	G.grandChild();
	G.child();
	G.parent();
	G.grandParent();

	}

}
