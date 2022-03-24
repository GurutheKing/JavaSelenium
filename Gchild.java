public class Gchild extends Child
{
String name="DG2";
int salary=600000;


public static void main(String[]args)
{
//String name="DG";
//int salary=500000;
//Parent parent = new Parent();
//parent.work();
	Gchild gchild = new Gchild();
	gchild.raise();
	gchild.play();
	gchild.work();
	System.out.println(gchild.salary);
	System.out.println(gchild.name);
	
	//child2.raise();
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