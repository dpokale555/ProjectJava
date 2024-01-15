package Day7_StringS_Methods;

public class DeclareStrings {

	public static void main(String[] args) {
		
		//String s="welcome";
		//String s=new String("welcome");
		
		//Senario 1
		/*String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);               //true
		System.out.println(s1.equals(s2));*/        //true
		
		//Senario 2
	  /*String s1=new String("welcome");
		String s2=new String("welcome");
		String s3=s1;
		
		System.out.println(s1==s2);              //false  - compare objects
		System.out.println(s1.equals(s2));       //true   - cpmapre value
		
		System.out.println(s1==s3);              
		System.out.println(s1.equals(s3));*/
		
		//Senario 3
		String s1="abc";
		String s2=new String("abc");
		
		System.out.println(s1==s2);           //false
		System.out.println(s2.equals(s2));    //true
		

	}

}
