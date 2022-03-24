package tamilnadu.salem;
import tamilnadu.chennai.Office;

public class Office3 extends Office
//default - package level access
{				
//private class level Access
	//javac -d . Office3.java
	//java tamilnadu.chennai.Office3

	public static void main(String[] args)
	{
	
	Office3 emp =new Office3();
//	emp.work();
	emp.doProject();
	//emp.leave();
	//	System.out.println("emp.incentives"); 
		//emp.lunchparty();
	}
}