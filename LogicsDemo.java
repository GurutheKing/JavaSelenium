package tamilnadu.chennai;

public class LogicsDemo
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LogicsDemo ld =new LogicsDemo();
ld.purse_of_a_student();
ld.flowers();
ld.balancedosa();
ld.balancedosa2();
	}
	private void purse_of_a_student() 
	{
		int purse = 0; 
		int day = 1; 
		while(day<=10)
		{
		purse = purse + day; 
		day = day+1; //2
		}
		System.out.println(purse); 
	}
		private void flowers() 
		{
			int basket = 1; 
			int temple = 6; 
			while(temple>0)
			{
			basket = basket * 2; 
			temple = temple-1; //2
			}
			System.out.println(basket);
	} 
		private void balancedosa()
		{
			int balance = 8; 
			int third = balance/2; 
			balance = balance + third; //12
			int second = balance/2; //6
			balance = balance + second; //18
			int first = balance/2; 	//9
			balance = balance + first; 			
			System.out.println(balance); 
					}
		private void balancedosa2()
		{
			int rem_dosas = 8; 
					int no_persons = 3;
					while (no_persons >0)
					{
						System.out.println("reminaing dosa" + rem_dosas);
						rem_dosas =rem_dosas+(rem_dosas/2);
						no_persons--;
									
					}
					System.out.println("original count of dosa" + rem_dosas);
							
		}
}
