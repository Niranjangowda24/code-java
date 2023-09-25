public class Billingcounter{

	public static void main(String[] args){
		new Billingcounter();
		new Billingcounter("bill");
	}
	Billingcounter(){
		System.out.println("no parameter contructor is used");
	}

	Billingcounter(String word){
		System.out.println("parameterized contructor is used");
		System.out.println(word);
	}
}