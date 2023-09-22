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


		static int divide(int Firstvalue,int Secondvalue) {
			System.out.println("invoking 2 parameters");
			int dividedvalue = Firstvalue / Secondvalue;
			return dividedvalue;
		}
		static int divide(int Firstvalue, int Secondvalue, int Thirdvalue){
			System.out.println("invoking 3 parameters");
			int dividedvalue = (Firstvalue / Secondvalue /Thirdvalue);
			return dividedvalue;
		}

		static void charge(char Letter){
			System.out.println("char datatype is used");
			System.out.println(Letter);
		}
		static void charge(boolean Letter){
			System.out.println("boolean datatype is used");
			System.out.println(Letter);
		}

		static void open(int Firstvalue,float Secondvalue){
			System.out.println("changing order");
			System.out.println(Firstvalue+","+Secondvalue);
		}
		static void open(float Secondvalue,int Firstvalue){
			System.out.println("changing order");
			System.out.println(Secondvalue+","+Firstvalue);
		}
	
}