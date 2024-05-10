package Day7_StringS_Methods;

public class DeclareStrings {

	public static void main(String[] args) {
		
		//String s="welcome";
		//String s=new String("welcome");
		
		//Senario 1
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);               //true
		System.out.println(s1.equals(s2));       //true
		
		//Senario 2
		String k1=new String("welcome");
		String k2=new String("welcome");
		String k3=k1;
		
		System.out.println(k1==k2);              //false  - compare objects
		System.out.println(k1.equals(k2));       //true   - cpmapre value
		
		System.out.println(k1==k3);              
		System.out.println(k1.equals(k3));
		
		//Senario 3
		String p1="abc";
		String p2=new String("abc");
		
		System.out.println(p1==p2);           //false
		System.out.println(p2.equals(p2));    //true
		

	}

}
