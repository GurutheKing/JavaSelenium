//Polymorphism
//Compile time polymorphism
//object over loading
//different in data types and diff number of arguments
public class Calculator
{
public static void main(String[]args)

{
Calculator calc =new Calculator();
calc.add(10, 20);
calc.add(10, 20, 30);
calc.add(10, 20, 30.5f);
}

public void add(int a1, int a2)
{
System.out.println(a1+a2);

}
public void add(int a1, int a2, int a3)
{
System.out.println(a1+a2+a3);
}	
	
public void add(int a1, int a2, float a3)
{
System.out.println(a1+a2+a3);

}



}