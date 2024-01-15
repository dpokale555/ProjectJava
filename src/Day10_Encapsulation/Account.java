package Day10_Encapsulation;

public class Account {
	
	private int acc_no;
	private String name;
	private double amount;
	
	void set_Accno(int acc_no)               //setter method
	{
		this.acc_no=acc_no;
	}
	int get_Accno()                          //getter method
	{
		return acc_no;
	}
	
	void set_Name(String name)               //setter method
	{
		this.name=name;
	}
	String get_Name()                          //getter method
	{
		return name;
	}
	
	void set_Amount(double amount)               //setter method
	{
		this.amount=amount;
	}
	double get_Amount()                          //getter method
	{
		return amount;
	}
}
