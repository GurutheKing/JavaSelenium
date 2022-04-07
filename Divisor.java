package tamilnadu.chennai;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisor div = new Divisor();
		div.finding_div_2();
	}

//public void finding_div(){
	// int div=1;
	// int max_div=100;
//	while(div<=max_div)
//	{
//		if(max_div%div==0)
//		{
//			System.out.println("the divisor of 100, "+ div);
//				}
//		div++;
//	}
//	
	public void finding_div_2() {
		int div = 2;
		int no = 27;
		boolean prime =true;
		//int count = 0;
		while (div <= no / 2) {
			if (no % div == 0) {
				System.out.println("The number " +no+" is divisible the "+div+" not prime");
				prime=false;
				break;
			}div++;
			if (prime==true) {
				System.out.println("The number " +no+" is divisible the "+div+"  is prime");
				
			}
			}
		}
		//System.out.println("No. of Divisors " + count);
	
}
