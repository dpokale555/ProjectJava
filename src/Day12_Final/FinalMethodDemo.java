package Day12_Final;

class Temp

{
	final void m1()
	{
		System.out.println("this is main method...");
	}
}

class TempChild extends Temp
{
	/*void m1();                                  //we can not overrid the method if used final keyword
	{
		System.out.println("this is overrided method form Temp class...");      
	}*/
}

public class FinalMethodDemo {

	public static void main(String[] args) 
	{
		TempChild T=new TempChild();

	}

}
