public class Dell{

	String price;
	String colour;
	static String weight;
	static String brand;
	String screen;

	static{
		weight = "2.4kg";
		brand = "dell";

	}

	public Dell(String price,String colour,String screen){
		this.price=price;
		this.colour=colour;
		this.screen=screen;

	}

	public static void main(String[] args){
		Dell dl = new Dell("56k","black","touchscreen");
		if(dl!=null){ 
		System.out.println(dl.price);
		System.out.println(dl.colour);
		System.out.println(dl.screen);
		System.out.println(dl.weight);
		System.out.println(dl.brand);
	}
	    Dell dl1 = new Dell("60k","silverblack","lcdscreen");
		if(dl1!=null){ 
		System.out.println(dl1.price);
		System.out.println(dl1.colour);
		System.out.println(dl1.screen);
		System.out.println(dl1.weight);
		System.out.println(dl1.brand);
	}
	    Dell dl2 = new Dell("56k","silver","led");
		if(dl2!=null){ 
		System.out.println(dl2.price);
		System.out.println(dl2.colour);
		System.out.println(dl2.screen);
		System.out.println(dl2.weight);
		System.out.println(dl2.brand);
	}




	}
}