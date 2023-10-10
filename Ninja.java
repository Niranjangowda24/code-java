public class Ninja{

    static String brand;
	String topspeed;
	String price;
	String engine;
	String fuelcapacity;
	static String seatheight;
	String weight;
	String colour;

	static{
		brand = "kawasaki";
		seatheight = "785mm";
	}

	public Ninja(String topspeed,String price,String engine,String fuelcapacity,String weight,String colour){
		this.topspeed = topspeed;
		this.price = price;
		this.engine = engine;
		this.fuelcapacity = fuelcapacity;
		this.weight = weight;
		this.colour = colour;
	}

	public static void main(String[] args){

		Ninja ninja300 = new Ninja("280","4l","296cc","17l","164kg","green");
		if(ninja300!=null){
		System.out.println(ninja300.topspeed);
		System.out.println(ninja300.price);
		System.out.println(ninja300.engine);
		System.out.println(ninja300.fuelcapacity);
		System.out.println(ninja300.weight);
		System.out.println(ninja300.colour);
		System.out.println(ninja300.brand);
		System.out.println(ninja300.seatheight);
	}
	Ninja ninjaz900 = new Ninja("300","12l","900cc","17l","164kg","green");
		if(ninjaz900!=null){
		System.out.println(ninjaz900.topspeed);
		System.out.println(ninjaz900.price);
		System.out.println(ninjaz900.engine);
		System.out.println(ninjaz900.fuelcapacity);
		System.out.println(ninjaz900.weight);
		System.out.println(ninjaz900.colour);
		System.out.println(ninjaz900.brand);
		System.out.println(ninjaz900.seatheight);
	}
	Ninja zx10r = new Ninja("299","24l","998cc","22l","207kg","blackandgreen");
		if(zx10r!=null){
		System.out.println(zx10r.topspeed);
		System.out.println(zx10r.price);
		System.out.println(zx10r.engine);
		System.out.println(zx10r.fuelcapacity);
		System.out.println(zx10r.weight);
		System.out.println(zx10r.colour);
		System.out.println(zx10r.brand);
		System.out.println(zx10r.seatheight);
	}



	}


}