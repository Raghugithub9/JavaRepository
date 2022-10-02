package OOPS;

public class RaghuBank implements Bank{

	public static void main(String[] args) {

		RaghuBank rb=new RaghuBank();
		rb.credit();
		rb.debit();
		rb.savings();
		rb.loans();
		
		System.out.println("======================================");
		Bank b=new RaghuBank();
		b.credit();
		b.savings();
		b.debit();
	
		
	}

	@Override
	public void debit() {
	
	System.out.println("debit");	
	}

	@Override
	public void credit() {
	System.out.println("credit");
		
	}

	@Override
	public void savings() {
	System.out.println("savings");
		
	}
	
public void loans() {
	System.out.println("loans");
		
	}

}
