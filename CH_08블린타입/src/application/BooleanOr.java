package application;

public class BooleanOr {

	public static void main(String[] args) {
		// or 둘중 하나라도 트루면 트루가됨
		boolean isRaining =true;
		boolean mightRain =false;
		boolean takeUmbrella =false;
		
 		takeUmbrella = isRaining ||mightRain;
 		
 		System.out.println(takeUmbrella);

	}

}
