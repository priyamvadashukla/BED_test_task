package bed_hour_to_String_Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bed_hour_to_String.Controller.HourtoStringController;
import bed_hour_to_String.Exception.HourandminnotValid;

public class HourtoStringControllertest {

	HourtoStringController hourtoStringController = new HourtoStringController();
    String error="Given time is Not Valid";
	@Test
	public void printhourandmin_pass() {
		String hour = "08";
		String min = "34";
		assertEquals("It's eight thirty four", hourtoStringController.printhourandmin(hour, min));
	}

	@Test
	public void printhourandmin_midday() {
		String hour = "12";
		String min = "00";
		assertEquals("It's Midday", hourtoStringController.printhourandmin(hour, min));
	}

	@Test
	public void printhourandmin_midnight() {
		String hour = "24";
		String min = "00";
		assertEquals("It's Midnight", hourtoStringController.printhourandmin(hour, min));
	}

	@Test
	public void printhourandmin_midnightFail() {
		String hour = "24";
		String min = "34";
		assertEquals(error,
				hourtoStringController.printhourandmin(hour, min));
	}

	@Test
	public void printhourandmin_timeFail() {
		String hour = "08";
		String min = "64";
		assertEquals(error,
				hourtoStringController.printhourandmin(hour, min));
	}

}
