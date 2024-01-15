package Day10_Encapsulation;

public class Keyword_StaticEx1_MainClass {
	
	//to access the static valriable/method in maon static method which is in other class need to add the class name before variable/method

	public static void main(String[] args) 
	{
		System.out.println(Keyword_StaticEx1_class.a);       //accesing the static variable in diffrent class without obj
		Keyword_StaticEx1_class.k1();                        //accesing the static method in diffrent class without obj

	}

}
