package tamilnadu.chennai;

public class Reverse2 {
public static void main(String[]args)
{
Reverse2 obj =new Reverse2();
obj.reversal2();
}
public void reversal2()
{
	int box = 153; 
	int box2 = box;
	int reverse = 0; 
	while(box>0)
	{
	int rem = box%10; 
	//reverse = (reverse*10)	+ rem; 
	reverse = reverse + (rem*rem*rem);
	box = box/10; 
	}
	System.out.println(reverse);
	System.out.println(box);
	if (box2 == reverse)
	{
		//System.out.println("Palindrome");
	System.out.println("Amstrong");
	}
	else
	{
		//System.out.println("Not a palindrome");
		System.out.println("Not a Amstrong");
	}
		
}


}
//neon
//strong
//perfect
