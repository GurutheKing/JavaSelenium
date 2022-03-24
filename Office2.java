package tamilnadu.chennai;
public class Office2 extends Office
//default - package level access
{				
//private class level Access
	//javac -d . Office2.java
	//java tamilnadu.chennai.Office2

	public static void main(String[] args)
	{
	
	Office2 emp =new Office2();
	emp.work();
	emp.doProject();
	emp.leave();
		System.out.println("emp.incentives"); 
		emp.lunchparty();
	}
}