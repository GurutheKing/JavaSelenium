package tamilnadu.chennai;

public class Greatest_Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greatest_Divisors greatt = new Greatest_Divisors();
greatt.great_div();
	}

	public void great_div()
	{
		int div =2;
		int no =123;
		int great =0;
	//	boolean prime=true;
		
		while(div<=no/2) {
			if(no%div==0) {
				great=div;
			}
			div++;
			}
		System.out.println(great);
}
	}
