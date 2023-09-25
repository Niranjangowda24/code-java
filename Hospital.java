public class Hospital{

	public static void main(String[] args){
		new Hospital();
		new Hospital('B');
	}
	Hospital(){
		System.out.println("no parameter contructor is used");
	}

	Hospital(char letter){
		System.out.println("parameterized contructor is used");
		System.out.println(letter);
	}
}