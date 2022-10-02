package OOPS;

public class SampleTest {
	
	public SampleTest() {
		System.out.println("Constructor Executed");
	}

	public SampleTest(String st) {
		System.out.println("Constructor with parameter Executed");
	}

	public static void main(String[] args) {

		SampleTest st1=new SampleTest();
		SampleTest st2=new SampleTest();
		SampleTest st3=new SampleTest();
		
		SampleTest st4=new SampleTest("Selenium Class");
		SampleTest st5=new SampleTest("Java Class");
		
			}

public void add() {
	System.out.println("Addition Function");
}
	
}
