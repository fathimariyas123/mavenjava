package superdemo;

public class Parent {
	int a = 20;
	int b = 10;
	Parent()
	{
		System.out.println("parent constructor");
	}
	Parent(int a , int b)
	{
		this();
		System.out.println(" parametersied constructor" + a+ "and"+ b);
	}
	public void sumParent()
	{
		int sum = a + b;
		System.out.println(" the  parent sum is :" +sum);
	}
     public void display()
     {
    	 System.out.println("this is a super keyword");
     }
}
