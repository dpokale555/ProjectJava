package Day8_ClassObjectMethods;

public class Practice_Class {
	
	int p_id;
	String p_name;
	char p_initial;
	
	void show()
	{
		System.out.print(p_id+" ");
		System.out.print(" "+p_name+" ");
		System.out.print(" "+p_initial);
		
	}
	
	void PraClass(int id, String name, char grade)
	{
		p_id=id;
		p_name=name;
		p_initial=grade;
	}
	
	
}
