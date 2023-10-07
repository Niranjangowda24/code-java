class Tab{

int id;
String name;
String email;
boolean working;
double salary;


public Tab(){
	System.out.println("1st constr");
}

public Tab(int id){
	this.id=id;
	System.out.println("2st constr");
}

public Tab(int id,String name){
	this(id);
	this.name=name;
	System.out.println("3st constr");
}

public Tab(int id,String name,String email){
	this(id,name);
	this.email=email;
	System.out.println("4th constr");
}

public Tab(int id,String name,String email,boolean working){
	this(id,name,email);
	this.working=working;
	System.out.println("5th contr");
}
public Tab(int id,String name,String email,boolean working,double salary){
	this(id,name,email,working);
	this.salary=salary;
	System.out.println("6th contr");
}

public static void main(String[] args){

	Tab tb = new Tab(23,"niranjan","gowda",true,2.34343);
	System.out.println(tb.id);
	System.out.println(tb.name);
	System.out.println(tb.email);
	System.out.println(tb.working);
	System.out.println(tb.salary);
}

}