public class Tablet{

	public static void main(String[] args){
		new Tablet();
		new Tablet(true);
	}
	Tablet(){
		System.out.println("no parameter contructor is used");
	}

	Tablet(Boolean pen){
		System.out.println("parameterized contructor is used");
		System.out.println(pen);
	}
}