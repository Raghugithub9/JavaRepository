package OOPS;

public class childExample extends ParentExample {

	public static void main(String[] args) {
		
		childExample ce=new childExample();
		ce.flat();
		ce.bankloan();
		ce.bankbalance();
		ce.car();
		ce.House();
		
		ParentExample pe=new ParentExample();
		pe.House();
		pe.car();
		pe.bankbalance();
		
		
		
	}

	
	public static void flat() {
		System.out.println("flat");
	}

	public static void bankloan() {
		System.out.println("Bank loan");
	}	
	
	
}
