
public class PrimitiveDataTypesDemo {
	public static void main(String[] args) {
		//byte takes 1 byte
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println("Min range of byte is "+byteMin+
				"\nMax range of byte is "+byteMax);
		System.out.println("---------------------------");
		
		//short takes 2 bytes
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("Min range of short is "+shortMin+
				"\nMax range of short is "+shortMax);
		System.out.println("---------------------------");
		
		//int takes 4 bytes 
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Min range of int is "+minInt+
				"\nMax range of int is "+maxInt);
		System.out.println("---------------------------");
		
		//long takes 8 bytes
		long maxLong = 9223372036854775807L;
		long minLong = - 9223372036854775808L;
		System.out.println("Min range of long is "+minLong+
				"\nMax range of long is "+maxLong);
		System.out.println("---------------------------");
		
		float f = 3234.141243278345f;
		double d = 3256.14124512345678902345678914f;
		System.out.println("float range is "+f+
				"\ndouble range is "+d);
		System.out.println("---------------------------");
		
		//boolean 
		boolean flag = false;
		System.out.println("boolean value is "+flag);
		
	}

}
