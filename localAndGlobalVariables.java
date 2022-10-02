package OOPS;

public class localAndGlobalVariables {

static int b=20;//global variable
	
	public static void main(String[] args) {

		System.out.println(b);
		localAndGlobalVariables lag=new localAndGlobalVariables();
		lag.add();
	}

public  void add() {
	int a=10;//local variable
	System.out.println("Value of a is "+a);
	System.out.println("Value of b is "+b);
}
	
}
