package OOPS;

public class BMWCar extends HyundaiCar {

	public static void main(String[] args) {
		
		BMWCar bm=new BMWCar();
		bm.start();
		bm.stop();
		bm.accel();
		bm.music();
	
		Car ca=new BMWCar();
		ca.accel();
		ca.start();
		ca.stop();
		ca.music();
	
	}
	
	
	


	@Override
	public void music() {
		System.out.println("music");
		
	}
	public void start() {
		System.out.println("new starting of Car");
		
	}
	
	
	

}
