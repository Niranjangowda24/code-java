public class Lamborghini{

  String model;
  String horsepower;
  String enginecylinder;
  static String doors;
  static String driveline;
  String engine;
  String fueltankcapacity;
  String price;
  String mileage;
  String topspeed;

  static {
  	doors = "2";
  	driveline = "Four wheel";
  }

public Lamborghini(String model,String horsepower,String enginecylinder,String engine,String fueltankcapacity,String price,String mileage,String topspeed)
{
	this.model = model;
	this.horsepower = horsepower;
	this.enginecylinder =enginecylinder;
	this.engine = engine;
	this.fueltankcapacity = fueltankcapacity;
	this.price = price;
	this.mileage = mileage;
	this.topspeed = topspeed;
}
	public static void main(String[] args){
		

		Lamborghini lambo = new Lamborghini("2019 lamborghini aventador","566kW","V engine","6.5L","85L","8crore","8kmpl","350kmph");
		if(lambo!=null){
		System.out.println(lambo.model);
		System.out.println(lambo.horsepower);
		System.out.println(lambo.enginecylinder);
		System.out.println(lambo.doors);
		System.out.println(lambo.driveline);
		System.out.println(lambo.engine);
		System.out.println(lambo.fueltankcapacity);
		System.out.println(lambo.price);
		System.out.println(lambo.mileage);
		System.out.println(lambo.topspeed);      
		}

		Lamborghini lambo1 = new Lamborghini("2018 lamborghini aventador","666kW","V engine","8.5L","85L","12crore","6kmpl","380kmph");
		if(lambo1!=null){
		System.out.println(lambo1.model);
		System.out.println(lambo1.horsepower);
		System.out.println(lambo1.enginecylinder);
		System.out.println(lambo1.doors);
		System.out.println(lambo1.driveline);
		System.out.println(lambo1.engine);
		System.out.println(lambo1.fueltankcapacity);
		System.out.println(lambo1.price);
		System.out.println(lambo1.mileage);
		System.out.println(lambo1.topspeed);
		}
		Lamborghini lambo2 = new Lamborghini("2023 lamborghini aventador 63","880kW","V engine","8.5L","85L","22crore","6kmpl","400kmph");
		if(lambo2!=null){
		System.out.println(lambo2.model);
		System.out.println(lambo2.horsepower);
		System.out.println(lambo2.enginecylinder);
		System.out.println(lambo2.doors);
		System.out.println(lambo2.driveline);
		System.out.println(lambo2.engine);
		System.out.println(lambo2.fueltankcapacity);
		System.out.println(lambo2.price);
		System.out.println(lambo2.mileage);
		System.out.println(lambo2.topspeed);
		}



	}


}

