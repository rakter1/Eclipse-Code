package booking;

import org.testng.annotations.Test;

public class BookingHotel {
	
	@Test(groups="regression")
	public void bookHotel_destinationCity() {
		System.out.println("BookHotel_Testcase1");
		
	}
	@Test
	public void bookHotel_checkIn() {
		System.out.println("BookHotel_Testcase2");
	}
	@Test
	public void bookHotel_checkOut() {
		System.out.println("BookHotel_Testcase3");
	}

}
