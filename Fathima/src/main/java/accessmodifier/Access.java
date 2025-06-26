package accessmodifier;

public class Access {
	public int a = 11;
	private int b = 22;
	protected int c = 33;
	int d = 44;
	public void publicMethod()
	{
		System.out.println("public method");
	}
	private void privateMethod()
	{
		System.out.println("Private method");
	}
	protected void protectedMethod()
	{
		System.out.println("protected Method");
	}
	void defaultMethod()
	{
		System.out.println("default method");
	}

	public static void main(String[] args) {
		Access A = new Access();
		A.publicMethod();
		A.privateMethod();
		A.protectedMethod();
		A.defaultMethod();
		// TODO Auto-generated method stub

	System.out.println(A.a);
	System.out.println(A.b);
	System.out.println(A.c);
	System.out.println(A.d);
	}

}
