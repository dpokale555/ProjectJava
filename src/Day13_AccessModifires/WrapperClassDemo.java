package Day13_AccessModifires;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		byte b =10;
		short s =20;
		int i =30;
		long l =40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		
		//Autoboxing: converting primitive datatypes to objects
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		
		//printing objects
		System.out.println("---Priniting objects value---");
		System.out.println("Byte Object:"+byteobj);
		System.out.println("Short Object:"+shortobj);
		System.out.println("Integer Object:"+intobj);
		System.out.println("Long Object:"+longobj);
		System.out.println("Float Object:"+floatobj);
		System.out.println("Double Object:"+doubleobj);
		System.out.println("Character Object:"+charobj);
		System.out.println("Boolean Object:"+boolobj);
		
		//Unboxing: converting objects into primitive datatypes
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
				
		//printing objects
		System.out.println("---Priniting Primitives value---");
		System.out.println("Byte Object:"+bytevalue);
		System.out.println("Short Object:"+shortvalue);
		System.out.println("Integer Object:"+intvalue);
		System.out.println("Long Object:"+longvalue);
		System.out.println("Float Object:"+floatvalue);
		System.out.println("Double Object:"+doublevalue);
		System.out.println("Character Object:"+charvalue);
		System.out.println("Boolean Object:"+boolvalue);

	}

}
