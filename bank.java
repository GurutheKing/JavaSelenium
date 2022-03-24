//calss name
public class bank
	
{
	//main method
	public static void main (String[] args)
	{
		//Object creation
		
		bank manager = new bank();
		int purse =manager.withdraw();
		float interest = 4.5f;
		System.out.println(purse);
		manager.payloan(purse,interest);
		//javac bank.java
		//java bank
		
		
	}
	void payloan(int amount, float in)
		//cahnge the variable form amt to amount
	{
		System.out.println(amount*in);
		System.out.println("paying loan");
		//javac bank.java
		
}

int withdraw()
{
	
	System.out.println("Give me 100 Rs");
	int amount= 100;
	return (amount);
}
}