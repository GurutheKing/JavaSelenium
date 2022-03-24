package tamilnadu.chennai;
public class Office //default - package level access
{    //private class level Access
 //javac -d . Office.java
int empId; 
protected int salary; 
 public static void main(String[] args)
 {
  System.out.println("Office"); 
 }
protected void doProject()
{
 System.out.println("Projects"); 
}
void work()
{
System.out.println("Working"); 
}
void leave()
{
System.out.println("On leave"); 
} 
private void lunchparty()
{
System.out.println("lunch party"); 


}
	
 
}