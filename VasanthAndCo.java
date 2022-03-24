public class VasanthAndCo
{
int discount;

public VasanthAndCo()
{
System.out.println("500 Offer");
}

public VasanthAndCo(int discount)
{
	this();
	this.discount = discount;
	System.out.println("VAC Offer"+this.discount);
}

	public static void main(String[]args)
	{
		VasanthAndCo tv = new VasanthAndCo();
		VasanthAndCo lap = new VasanthAndCo(5);
	}
}


