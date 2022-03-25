public class Bank2
{
	public static void main(String[]args)
	{
		Bank2 Manager = new Bank2();
		//Manager.withdraw();
		//the value of 100 is returned here but we do not know how to pick it
		int purse = Manager.withdraw();
		System.out.println(purse);
		Manager.payLoan(purse);
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
	//no daa afte rhe value is returned
	//error
}
	
	void payLoan(int amount)
	{
	System.out.println(amount);
	}
	
}