package oopsconcept;

public class ChildClass extends ParentClass {
	public void childClass() 
	{
		System.out.println("This is a child class");
	}

	public static void main(String[] args) {
		ChildClass C = new ChildClass();
		C.childClass();
		C.parentClass();
		// TODO Auto-generated method stub

	}

}
