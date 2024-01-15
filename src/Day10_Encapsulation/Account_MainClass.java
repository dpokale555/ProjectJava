package Day10_Encapsulation;

public class Account_MainClass {

	public static void main(String[] args) {
		
		Account acc=new Account();
		
		//calling setter method
		acc.set_Accno(1234);
		acc.set_Name("Karan");
		acc.set_Amount(2000.67);
		
		//calling the getter method
		System.out.println(acc.get_Accno());
		System.out.println(acc.get_Name());
		System.out.println(acc.get_Amount());

	}

}
