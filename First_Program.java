
package tamilnadu.chennai;

public class First_Program implements Rules {


	public static void main(String[] args) {
	
		System.out.println("Tested first program");
		First_Program fp =new First_Program();
		fp.add();
		fp.test();
	}

	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Inside the add method");
		System.out.println(2+5*78);
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("impleted rules interface");
		
	} 

}
