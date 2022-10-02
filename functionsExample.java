package OOPS;

public class functionsExample {

	public static void main(String[] args) {

		functionsExample fe=new functionsExample();
		//static functions can be called
		musicplayer();
		functionsExample.musicplayer();
		
		//non static functions to be called only by objref
		fe.horn();
		
	}

public static void musicplayer() {
	System.out.println("Play the music");
}
	
public void horn() {
	System.out.println("Horn");
}
	

}
