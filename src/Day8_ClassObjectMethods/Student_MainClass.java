package Day8_ClassObjectMethods;

public class Student_MainClass {

	public static void main(String[] args) {
		
		/*
		//Aprroach 1: using object refernce variable
		
		Student_Class1 s_obj1=new Student_Class1();
		
		s_obj1.sid=01;
		s_obj1.sname="Ram";
		s_obj1.grade='A';
	
		s_obj1.show();
		
		
		//Approach 2: using a method 
		
		Student_Class1 s_obj1=new Student_Class1();
		
		s_obj1.SetData(02, "Karan", 'B');
		s_obj1.show();                             */
		
		
		//Approach 3: using a constructor
		
		Student_Class1 stu=new Student_Class1(03,"Prem",'H');
		stu.show();
		
	}

}
