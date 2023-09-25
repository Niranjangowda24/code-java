public class Patient{

	public static void main(String[] args){
		new Patient();
		new Patient(2.2f);
	}
	Patient(){
		System.out.println("no parameter contructor is used");
	}

	Patient(float ward){
		System.out.println("parameterized contructor is used");
		System.out.println(ward);
	}
}