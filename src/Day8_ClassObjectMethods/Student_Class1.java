package Day8_ClassObjectMethods;

public class Student_Class1 {
	
	int sid;
	String sname;
	char grade;
	
	void show()                                              //for Approch 1;
	{
		System.out.println(sid+"     "+sname+"     "+grade);
	}
	
	void SetData(int id, String name, char g)               //for Approch 2;
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	Student_Class1(int id, String name, char g)              //for Approch 3: constructor name should be same as class
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
}
