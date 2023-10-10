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

		Ninja ninja300 = new Ninja300("280","4l","296cc","17l","164kg","green");
		System.out.println(ninja.topspeed);
		System.out.println(ninja.price);
		System.out.println(ninja.engine);
		System.out.println(ninja.fuelcapacity);
		System.out.println(ninja.weight);
		System.out.println(ninja.colour);
		System.out.println(ninja.brand);
		System.out.println(ninja.seatheight);
	}


}