public class HumanBeing2
{
	int salary =7000;
	public static void main (String[] args)
	{
		HumanBeing2 HB =new HumanBeing2();
		System.out.println("Salary is "+ HB.salary);
		HB.buyVeg(200);
		
		//System.out.println("balance is"+balance);
	}
	
	public void buyVeg(int purse)
	{
		int bill =150;
		int balance = purse -bill;
		System.out.println("Bill is"+bill);
		System.out.println("purse is"+purse);
		System.out.println("balance is"+balance);
		//System.out.println("Salary is "+ HB.salary);//
	}
}

			