package aggregation1;

import aggregation3.Address;
import aggregation3.Salary;

public class Employee {
	String name;
	int id;
	String postion;
	Address qa;
	Salary sa;
	Employee(String name, int id,String postion,Address qa,Salary sa)
	{
		this.name = name;
		this.id = id;
		this.postion = postion;
		this.qa = qa;
		this.sa = sa;
	}
	
public void employeeDetails()
{
	System.out.println("Name :" +name);
	System.out.println("id :" +id);
	System.out.println("postion :" +postion);
	System.out.println("housename :" +qa.housename);
	System.out.println("housenumber : " +qa.housenumber);
	System.out.println("Streetname:"  +qa.streetname);
	System.out.print("District :"  +qa.district);
	System.out.println("Pincode :"  +qa.pincode);
	System.out.println("Basic :"  +sa.basic);
	System.out.println("Incentive :"  +sa.incentive);
	System.out.println("Houserent :"  +sa.houserent);
	System.out.println("Department :"  +sa.department);
}
	public static void main(String[] args) {
		Salary S = new Salary(4000, 3500, 1500, "Marketing");
		Address A = new Address("Fayas Manzil", 413, "Attingal", "Trivandram", 695310);
		Employee E = new Employee("Riyas", 111, "Manger", A,S);
		E.employeeDetails();
		// TODO Auto-generated method stub

	}

}
