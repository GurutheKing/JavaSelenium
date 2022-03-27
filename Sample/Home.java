// class Home is created lets say a a space of memory
public class Home

{
	//main method  -a small memory space inside the class
	public static void main(String[]args)
	{
		Home boy = new Home();
		//obj reference boy goes to the memory2 of the
		//method created processes the print statement and comes back to main method
		boy.bring_newspaper();
	}
	//another memory space inside the class
	//void - nothing is returned from this menthod back to main method
		void bring_newspaper()
	{
		System.out.println("Took the news paper ");
	}
}