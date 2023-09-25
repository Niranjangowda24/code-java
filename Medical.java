public class Medical{

	public static void main(String[] args){
		new Medical();
		new Medical('2');
	}
	Medical(){
		System.out.println("no parameter contructor is used");
	}

	Medical(int number){
		System.out.println("parameterized contructor is used");
		System.out.println(number);
	}
}