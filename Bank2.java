public class Bank2
{
	public static void main(String[]args)
	{
		Bank2 Manager = new Bank2();
		//Manager.withdraw();
		//the value of 100 is returned here but we do not know how to pick it
		int purse = Manager.withdraw();
		float interest =4.5f;
		System.out.println("The amt withdrawn is "+purse);
		Manager.payLoan(purse, interest);
		//comprehensive approach
		//System.out.println(Manager.withdraw());
	}
	
	
int withdraw()
{
	System.out.println("Give me 200 Rs");
	int amount=200;
	return amount;
	//returned is value and not variable
	//System.out.println("abcd");
	//no data after the value is returned
	//error
}
	
	void payLoan(int amt, float interest_b)
	{
	System.out.println("The loan amount paid is "+amt);
		System.out.println("The interest amount paid is "+(amt*interest_b/100));
	}
	
}