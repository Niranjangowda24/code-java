public class Remote{
	public static void main(String[] args){
		TV tv = new TV("panasonic",4,"lcd","42 inchs",2,"2.1");
		
		if(tv!=null){
		System.out.println("Brand:"+tv.brand);
		System.out.println("colour:"+TV.colour);   //Staic variables 
		System.out.println("Shape of the TV:"+TV.shape);      //Static variables
		System.out.println("buttons int TV:"+tv.buttons);
		System.out.println("display size:"+tv.displaysize);
		System.out.println("type of screen:"+tv.screen); 
		System.out.println("number of connection:"+tv.connection);
		System.out.println("weight of TV:"+tv.weight);

		}
		
		TV.risevolume();         //Static method
		
		TV.watchmovies();       //Staic method
		
		tv.decreasevolume(4);    //Non static method
		
		tv.changechannel(4);    //Non static method 
	}

}
class TV{

	
	String brand;
	static String colour;
	static String shape;
	int buttons;
	String displaysize;
	String screen;
	int connection;
	String weight;

	static{
		colour = "black";
		shape = "rectangle";
	}


		TV(String brand,int buttons,String displaysize,String screen,int connection,String weight){
			this.brand = brand;
			this.buttons = buttons;
			this.displaysize = displaysize;
			this.screen = screen;
			this.connection = connection;
			this.weight = weight;
		}

		public static void risevolume(){
			System.out.println("rise tv volume");
		}

		public static void watchmovies(){
			System.out.println("watching movies");

		}

		public void decreasevolume(int buttons){
			System.out.println("decreasing the volume");

		}

		public void changechannel(int buttons){
			System.out.println("changing the channel");
		}
	}

