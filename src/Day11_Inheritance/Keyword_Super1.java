package Day11_Inheritance;

public class Keyword_Super1 
{
	String color="white";
	
	void eat()
	{
		System.out.println("Eating bread");
	}

}


class Dog extends Keyword_Super1
{
	String color="Black";
	 void display()
	 {
		 System.out.println(color);
		 System.out.println(super.color);
	 }
	 
	 void eat()
	 {
		 System.out.println("eating bread....");
		 super.eat();
		
	 }
	
}
