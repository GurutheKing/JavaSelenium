//method overriding
//dynamic binding
public class Child3 extends Parent3
{
public static void main (String[]args)
{
//Parent3 parent3 = new Parent3();
Parent3 parent3 = new Child3();
parent3.watchTV();
//parent3.coding();
//Child3 child3 = new Child3();
//child3.watchTV();
//new Child3().watchTV();
System.out.println(parent3.pocket_money);
//to check the value cannot be assigned to alreay declared final
//parent3.pocket_money=10;
}
//public void watchTV()
//{
//System.out.println("Smart TV");
//}

public void coding()
{
	System.out.println("coding");
}
}