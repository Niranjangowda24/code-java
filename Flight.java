public class Flight{
	String firstName;
	String lastName;
	static String gender;
	int age;
	static String nationality;
	static String airportName;
	String destination;
	String journeyDate;
	String deptTiming;
	String arriTiming;
	
	static{
		gender = "Male";
		nationality = "Indian";
		airportName = "kempegowda International Airport";
	}
	
	Flight(String firstName,String lastName,int age,String destination,String journeyDate,String deptTiming,String arriTiming){
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.destination = destination;
         this.journeyDate = journeyDate;
         this.deptTiming = deptTiming;
         this.arriTiming = arriTiming;
	}		 
	
	public static void main(String [] args){
		
		Flight fl = new Flight("Manoj","T J",23,"Dubai","12/10/2023","23:20","06:34");
		Flight fl1 = new Flight("Ashish","Shetty",22,"Mumbai","22/10/2023","20:20","09:34");
		Flight fl2 = new Flight("Arjun","V",21,"Qatar","11/10/2023","11:20","15:34");
		
		if(fl!=null && fl1!=null && fl2!=null){
			System.out.println("First Name:"+fl.firstName);
			System.out.println("Last Name:"+fl.lastName);
			System.out.println("Gender"+fl.gender);
			System.out.println("Age:"+fl.age);
			System.out.println("Nationality:"+fl.nationality);
			System.out.println("Airport Name:"+fl.airportName);
			System.out.println("Destination:"+fl.destination);
			System.out.println("Journey Date:"+fl.journeyDate);
            System.out.println("Departure Timing:"+fl.deptTiming);
            System.out.println("Arrival Timing:"+fl.arriTiming);
			
			System.out.println("-------------------------------------------------");
			
			System.out.println("First Name:"+fl1.firstName);
			System.out.println("Last Name:"+fl1.lastName);
			System.out.println("Gender"+fl1.gender);
			System.out.println("Age:"+fl1.age);
			System.out.println("Nationality:"+fl1.nationality);
			System.out.println("Airport Name:"+fl1.airportName);
			System.out.println("Destination:"+fl1.destination);
			System.out.println("Journey Date:"+fl1.journeyDate);
            System.out.println("Departure Timing:"+fl1.deptTiming);
            System.out.println("Arrival Timing:"+fl1.arriTiming);
			
			System.out.println("-------------------------------------------------");
			
			System.out.println("First Name:"+fl2.firstName);
			System.out.println("Last Name:"+fl2.lastName);
			System.out.println("Gender"+fl2.gender);
			System.out.println("Age:"+fl2.age);
			System.out.println("Nationality:"+fl2.nationality);
			System.out.println("Airport Name:"+fl2.airportName);
			System.out.println("Destination:"+fl2.destination);
			System.out.println("Journey Date:"+fl2.journeyDate);
            System.out.println("Departure Timing:"+fl2.deptTiming);
            System.out.println("Arrival Timing:"+fl2.arriTiming);
			
		}
	}
}
			
			
			
		
		
		
		
	
	
	
    	
