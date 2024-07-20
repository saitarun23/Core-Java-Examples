
public class TypeCasting {
	
	public static void main(String[] args) {
		byte a=127;		// -128 to 127 
		short b=a;		// implicit type casting -32678 to 32767
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		short c=128;		// 2 byte memory and value is 100
		//byte d=(type)c;
		byte d = (byte)c;		// explicit type casting 
		System.out.println("c "+c);
		System.out.println("c "+d);
		// int and float family 
		int m = 100;
		float n=m;			// implicit 
		System.out.println("m "+m);
		System.out.println("n "+n);
		//float o = (float)100.0;		// implicit type casting because every decimal number by default double consider 
		float o = 100.0f;				// implicit type casting 
		int p = (int)o;			// explicit 
		System.out.println("o "+o);
		System.out.println("p "+p);
	}

}

/*   
Output
a 127
b 127
c 128
c -128
m 100
n 100.0
o 100.0
p 100
*/