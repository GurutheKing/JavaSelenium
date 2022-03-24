public class Child extends Parent
{
String name="DG";
int salary=500000;


public static void main(String[]args)
{
//String name="DG";
//int salary=500000;
Parent parent = new Parent();
parent.work();
	Child child = new Child();
	child.work();
	child.play();
	System.out.println(child.salary);
	System.out.println(child.name);
	
	//child.raise();
	//System.out.println("Name of the Parent is "+child.name);
}
//method overridding if the parent.work(); is used
public void work()
{
System.out.println("Child is Working as a Java Programmer");
}

public void play()
{
System.out.println("Am going out for play says the child");
}

}