package Day11_Inheritance;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 12.5;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Bank R=new Bank();
		System.out.println(R.roi());
		
		ICICI Ric=new ICICI();
		System.out.println(Ric.roi());
		
		SBI Rsbi=new SBI();
		System.out.println(Rsbi.roi());

	}

}
