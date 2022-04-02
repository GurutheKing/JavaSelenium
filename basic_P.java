package tamilnadu.chennai;

public class basic_P
{
	public static void main(String[]args)
	{
		basic_P bp =new basic_P();
		bp.looping();
	}
	public void looping()
	{
		int count =1;
		if(count<10)
		{System.out.println("used if");
		//count =count +1;
		while(count<10)
		{System.out.println("used while" + count);
		count =count +1;
		}
	}
}}
