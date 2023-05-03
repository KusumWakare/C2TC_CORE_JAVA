
public class TypeCastingDemo {

	public static void main(String[] args) {
		//widening/implicit type casting
		
		byte b = 10;
		int j = b;
		System.out.println(j);
		
		float f = 22.14f;
		double d = f;
		System.out.println(d);
		
		char ch = 'A';
		int j1 = ch;
		System.out.println(j1);
		
		char var1 = '\u00A7';
		int i = var1;
		System.out.println(i);
		
		//narrowing/explicit type casting
		
		double f1 = 10.52f;
		long l = (long) f1;
		System.out.println(l);
		
		long l1 = 923372036854775806L;
		int i2 = (int) l1;
		System.out.println(i2);
		
		float f2 = 34.56f;
		int i3 = (int)f2;
		System.out.println(i3);
		
		byte b1 = 90;
		char ch1 = (char) b1;
		System.out.println(ch1);
		

	}

}
