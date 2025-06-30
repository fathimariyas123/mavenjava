package encapsulation2;

public class Student {
	private int  sid;
	private String sname;
	public void setData(int sid,String name)
	{
		this.sid = sid;
		this.sname = sname;
	}

	public void getData()
	{
		System.out.println("name :" +sname);
		System.out.println("id : " +sid);
	}
		
		
	}
	


