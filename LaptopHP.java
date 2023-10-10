public class LaptopHP{

	static String brand;
	String price;
	String weight;
	static String keyboardlight;
	String colour;

	static{
		brand = "HP";
		keyboardlight = "white";
	}

	public LaptopHP(String price,String weight,String colour){
		this.price = price;
		this.weight = weight;
		this.colour = colour;
	} 

	public static void main(String[] args){
		LaptopHP hp = new LaptopHP("80k","1.2kg","silverblack");
		if(hp!=null){ 
		System.out.println(hp.price);
		System.out.println(hp.weight);
		System.out.println(hp.colour);
		System.out.println(hp.brand);
		System.out.println(hp.keyboardlight);
	}
		LaptopHP hp1 = new LaptopHP("90k","1.4kg","silverb");
		if(hp1!=null){ 
		System.out.println(hp1.price);
		System.out.println(hp1.weight);
		System.out.println(hp1.colour);
		System.out.println(hp1.brand);
		System.out.println(hp1.keyboardlight);
	}
		LaptopHP hp2 = new LaptopHP("88k","1.1kg","black");
		if(hp2!=null){ 
		System.out.println(hp2.price);
		System.out.println(hp2.weight);
		System.out.println(hp2.colour);
		System.out.println(hp2.brand);
		System.out.println(hp2.keyboardlight);
	}


	}


}