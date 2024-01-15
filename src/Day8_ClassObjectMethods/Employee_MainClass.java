package Day8_ClassObjectMethods;

public class Employee_MainClass {

	public static void main(String[] args) {
		
		Class_Employee eobj1=new Class_Employee();    //object creation
		
		eobj1.E_Id=101;
		eobj1.E_Name="Karan";
		eobj1.E_Position="Engg";
		eobj1.E_Salary=200000;
		
		eobj1.dispaly();
		
		Class_Employee e_obj2=new Class_Employee();
		
		e_obj2.E_Id=102;
		e_obj2.E_Name="Ram";
		e_obj2.E_Position="Support";
		e_obj2.E_Salary=700000;
		
		e_obj2.dispaly();
		

	}

}
