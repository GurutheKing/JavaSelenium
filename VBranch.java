public class VBranch extends VasanthAndCo
{
int discount;
String offer;

public VBranch()
{
System.out.println("VB");
}
public VBranch(int discount, String offer)
{
//super(3);
super(discount);
this.discount = discount;
this.offer =offer;
System.out.println("VBranch special Offer"+discount+offer);
}

public static void main(String []args)
{
VBranch tv =new VBranch();
VBranch lap =new VBranch(10,"pendrive");
}
}