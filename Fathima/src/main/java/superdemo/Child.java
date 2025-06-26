package superdemo;

public class Child extends Parent {
	int a = 30;
	int b = 15;
	Child()
	{
		super(20,30);
		System.out.println("child constructor");
	}
	public void sumChild()
	{
		super.sumParent();
		super.display();
		this.sub();
		int sum = super.a +super.b;
		System.out.println(" the child sum is :" +sum);
	}
public void sub()
{
	System.out.println("this is a second method");
}
	public static void main(String[] args) {
		Child C = new Child();
		//C.sumChild();
		
		// TODO Auto-generated method stub

	}

}
