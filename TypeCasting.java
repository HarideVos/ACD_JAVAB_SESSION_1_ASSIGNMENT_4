import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		short a;
		byte b;
		int c;
		long d;
		float e;
		double f;
		
		a=0;
		b=0;
		c=0;
		d=0;
		e=0;
		f=0;
		
		System.out.println("Input short sized number");
		a = sc.nextShort();
		System.out.println(a);
		System.out.println("Input byte sized number");
		b = sc.nextByte();
		System.out.println(b);
		c = a+b;
		System.out.println(c);
		d = c+b;
		System.out.println(d);
		e = c+d;
		System.out.println(e);
		f = e+d;
		System.out.println(f);
		sc.close();
	}

}
