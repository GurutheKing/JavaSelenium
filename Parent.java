public class Parent
{
int salary =100000;
String name ="SGR";

public static void main (String[]args)
{

Parent parent =new Parent();
	
	parent.raise();
	parent.work();


}


public void raise()
{

System.out.println ("Growing");
}

public void work()
{
System.out.println("Parent is Working as a Administrator");
}
}