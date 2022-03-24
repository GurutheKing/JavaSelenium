public class BO extends HO
{
String address = "Chennai";

public BO()
{
System.out.println("BO Constructor");
}

public static void main(String[]args)
{
BO bo = new BO();
// child object wil behave as parent object
bo.work();
bo.printAddress();

}
public void printAddress()
{
System.out.println("Below is address from Parent Cons");
System.out.println(super.address);
super.work();
System.out.println("Below is address from Child Cons");
System.out.println(address);
}
}

