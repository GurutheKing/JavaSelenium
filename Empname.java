class Empname extends EmpnamePrent implements EmployeeIn,Traffic
//in java we can give only one parent class-> as damond problemmay arise
{
	public static void main(String[]args)
	{
		Empname ram = new Empname();
		ram.work();
		ram.read_news_paper();
		//ram.no_of_leaves =45;
		System.out.println(ram.no_of_leaves);
		System.out.println(EmployeeIn.no_of_leaves);
	ram.maintain_speed();
	EmployeeIn manager = new Empname();
	//dynamic binding is implemented here
	manager.work();
	manager.take_leave();
	manager.give_salary();
	manager.watch_movies();
	}
	public void work(){
		System.out.println("Work is QA");
		}
		public void movies(){
		System.out.println("Watching RRR");
		}
		public void maintain_speed()
		{
		System.out.println("Speed s maintained at 40km");
		}
		
	public void give_salary()
	{
	System.out.println("Salary is credited");
	}
		
	public void take_leave()
	{
	System.out.println("Leave is available");
	}
}