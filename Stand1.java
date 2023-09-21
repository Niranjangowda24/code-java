public class Stand1 {
	public static void main(String[] args){
		run(); //invoke or calling

		byte returnByte = one();
		System.out.println(returnByte);

		short returnShort = two();
		System.out.println(returnShort);

		int returnInt = three();
		System.out.println(returnInt);

		long returnLong = four();
		System.out.println(returnLong);

		float returnFloat = five();
		System.out.println(returnFloat);

		double returnDouble = six();
		System.out.println(returnDouble);

		char returnChar = seven();
		System.out.println(returnChar);

		boolean returnBoolean = eight();
		System.out.println(returnBoolean);
	}
	static void run(){
		System.out.println("the code is executed");
	}
	static byte one(){
		byte a=34;
		return a;
	}
	static short two(){
		short b=44;
		return b;
	}
	static int three(){
		int c=1234;
		return c;
	}
	static long four(){
		long d=24545;
		return d;
	}
	static float five(){
		float e=3.34536f;
		return e;
	}
		static double six(){
		double f=3.3432536;
		return f;
	}
		static char seven(){
		char g='a';
		return g;
	}
		static boolean eight(){
		boolean h=true;
		return h;
	}
	
}