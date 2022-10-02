package OOPS;

public class constructorExample {

	//Constructor
	public constructorExample() {
		System.out.println("Constructor Example");
	}
	
	public constructorExample(String st) {
		System.out.println(st);
	}
	
	
	public static void main(String[] args) {
		
		constructorExample ce5=new constructorExample("Constructor with parameter");
		constructorExample ce6=new constructorExample();
		
	}

}
