package Day13_AccessModifires;

public class CheckDataVaribles {
	
	public static void main(String[] args) {
		String s="1234";
		
		Integer instr=Integer.parseInt(s);
		System.out.println(instr.getClass());
		
		String s1="23.55";
		
		Double dstr=Double.parseDouble(s1);
		System.out.println(dstr.getClass());
		
		int x=234;
		String str=String.valueOf(x);
		System.out.println(str.getClass());

	}

}
