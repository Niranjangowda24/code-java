public class Tap{
	public static void main(String[] args){

int returnvalue1 = divide(24,4);
System.out.println(returnvalue1);

int returnvalue2 = divide(48,12,2);
System.out.println(returnvalue2);

charge('M');
charge(true);

open(22,54.4f);
open(54.4f,43);

}


		static int divide(int firstvalue,int secondvalue) {
			System.out.println("invoking 2 parameters");
			int dividedvalue = firstvalue / secondvalue;
			return dividedvalue;
		}
		static int divide(int firstvalue, int secondvalue, int thirdvalue){
			System.out.println("invoking 3 parameters");
			int dividedvalue = (firstvalue / secondvalue /thirdvalue);
			return dividedvalue;
		}

		static void charge(char letter){
			System.out.println("using char datatype");
			System.out.println(letter);
		}
		static void charge(boolean letter){
			System.out.println("using boolean datatype");
			System.out.println(letter);
		}

		static void open(int firstvalue,float secondvalue){
			System.out.println("changing order");
			System.out.println(firstvalue+","+secondvalue);
		}
		static void open(float secondvalue,int firstvalue){
			System.out.println("changing order");
			System.out.println(secondvalue+","+firstvalue);
		}
	
}