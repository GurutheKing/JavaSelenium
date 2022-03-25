// object overriding
//run time polymorphism

public class Scicalc extends Calculator
{
public static void main (String[]args)
{
Scicalc scicalc = new Scicalc();
scicalc.add(100, 100);
}
//intentional addition of the below method to override the parents method add
public void add(int a1, int a2)
{

if (a1>100 && a2 >100)
{
System.out.println(a1+a2);
}
else
{
System.out.println("Please enter numbers greater than 100");

}
}


}
