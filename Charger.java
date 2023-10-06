public class Charger{

	int number;
	float value;
	char alphabet;
	short num;
	double dbl;
	boolean torf;
	byte byt;
	long lng;

	Charger(int number,float value,char alphabet,short num,double dbl,boolean torf,byte byt,long lng){
		this.number=number;
		this.value=value;
		this.alphabet=alphabet;
		this.num=num;
		this.dbl=dbl;
		this.torf=torf;
		this.byt=byt;
		this.lng=lng;

	}
	
	

	public static void main(String[] args){

		Charger ch = new Charger(10,3.4f,'A',(short)100,1.23342,true,(byte)1,13421343l);
		System.out.println(ch.number);
		System.out.println(ch.value);
		System.out.println(ch.alphabet);
		System.out.println(ch.num);
		System.out.println(ch.dbl);
		System.out.println(ch.torf);
		System.out.println(ch.byt);
		System.out.println(ch.lng);



		Charger ch1 = new Charger(100,1.2f,'B',(short)322,2.2345,false,(byte)2,345435l);
		System.out.println(ch1.number);
		System.out.println(ch1.value);
		System.out.println(ch1.alphabet);
		System.out.println(ch1.num);
		System.out.println(ch1.dbl);
		System.out.println(ch1.torf);
		System.out.println(ch1.byt);
		System.out.println(ch1.lng);

	}
}