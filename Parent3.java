//if made as FINAL cannot be inherited, remove the final in the next line to inherit to child class.
public final class Parent3
{
//final keyword is to make sure the valriable is not updaed in the child class	
	// child class uses only the parent class vlaue and is not overridden
final int pocket_money =5;
public static void main(String[]args)
{
	
Parent3 parent3 =new Parent3();
parent3.watchTV();

}


public final void watchTV()
{
System.out.println("LG");

}

}
