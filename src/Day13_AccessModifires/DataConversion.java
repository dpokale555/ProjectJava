package Day13_AccessModifires;

public class DataConversion {

	public static void main(String[] args) 
	{
		String s="welcome";
		String s1="30";
		String s2="20";
		String s3="40.5";
		String s4="true";
		
		System.out.println(s+s1+s2+s3+s4);
		
		int s1num=Integer.parseInt(s1);
		int s2num=Integer.parseInt(s2);
		double s3num=Double.parseDouble(s3);
		boolean s4num=Boolean.parseBoolean(s4);
		System.out.println(s1num+s2num+s3num);
		System.out.println(s4);
		
		String s1S=String.valueOf(s1num);
		String s2S=String.valueOf(s2num);
		String s3S=String.valueOf(s3num);
		String s4S=String.valueOf(s4num);
		
		System.out.println(s1S);
		System.out.println(s2S);
		System.out.println(s3S);
		System.out.println(s4S);
		

	}

}
