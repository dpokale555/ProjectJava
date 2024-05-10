package Day7_StringS_Methods;

public class StringsMethods1 {

	public static void main(String[] args) {
		
		String s="welcome";
		
		System.out.println(s);

		//predefine length method - to know the length of string
		System.out.println("Lentgh of s string of using 'length' method is:"+s.length());
		
		//Predefine concat() - joining the strings
		String s1="Learning";
		String s2=" the JAVA";
		String s3=" as a biginer";

		System.out.println(s1+s2);;
		System.out.println(s1.concat(s2));
		System.out.println("Learning".concat(" the JAVA"));
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim() method 
		String s4="   JAVA    ";
		
		System.out.println("Length of string :"+s4.length());
		System.out.println("before triming :"+s4);
		System.out.println("after triming :"+s4.trim());
		
		//charAt() -- returns a single charechaters based on the index
		//index started from zero
		
		String s5="welcome";
		System.out.println("the third position cha is :"+s5.charAt(3));
	
		//contains() -- returns a boolean value true/false
		System.out.println("'wel' letters contains in string is :"+s5.contains("wel"));
		System.out.println("'COME' letters contains in string is :"+s5.contains("COME"));     //case sensetive
		System.out.println("'rtyu' letters contains in string is :"+s5.contains("rtyu"));     //if not containe give false
	
	    
		//equals()    equalsIgnoreCase()   -- compaire the 2 strings return true/false
		String s6= "WELCOME";
		String s7= "welcome";
		
		System.out.println("Equal status of both strings are :"+s6.equals(s7));   //case sensetive
		System.out.println("Equal status of both strings are :"+s6.equalsIgnoreCase(s7));   //not case sensetive
		
		//replace()  -- replace single/multiple/sequemce of charectors
		String s8="Welcome to selenium testing and selenium practice";
		
		System.out.println(s8.replace('e', 'X'));
		System.out.println(s8.replace("selenium", "JAVA"));
		
	
		//substring() -- extract substring of the main string 
		System.out.println(s.substring(3,5));
		
		//split() - divide the string into multiple parts based on delimiter/seperator
		//Should not used * $ ^ ( ) + - as a delimiter/seperator
		String g="abc@vpa.com";
		
		String a[]=g.split("c");
		
		System.out.println("Split value is :"+a[0]);
		System.out.println("Split value is :"+a[1]);
		System.out.println("Split value is :"+a[2]);
				
		// toUpperCase() & toLowerCase()
		
		String c="WELcome";
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		
		//one method within another method
		
		String k="welcome";
		
		System.out.println(k.contains("WEL".toLowerCase()));
		
	}

}
