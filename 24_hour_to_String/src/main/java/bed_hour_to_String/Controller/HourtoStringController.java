package bed_hour_to_String.Controller;

import bed_hour_to_String.Exception.HourandminnotValid;
import bed_hour_to_String.Service.HourtoStringService;

public class HourtoStringController {

	public HourtoStringController() {

	}

	static HourtoStringService hourtoStringService = new HourtoStringService();

	public static String printhourandmin(String hour, String min) {

		try {
			int hour_int = Integer.parseInt(hour);
			int min_int = Integer.parseInt(min);
			if (hour_int < 0 || hour_int > 24 || min_int < 0 || min_int > 60 || hour.length()>2 || min.length()>2) {
				throw new HourandminnotValid("Given time is Not Valid");
			}
			if (hour.equals("12") && min.equals("00")) {
				String midday="It's Midday";
				System.out.println(midday);
				return midday;
				

			}
			else if(hour.equals("24")) {
				if(min.equals("00")) {
				String midnight="It's Midnight";
				System.out.println(midnight);
				return midnight;
				}
				else {
					throw new HourandminnotValid("Given time is Not Valid");
				}
			}
			else {
			String sHour = hourtoStringService.getNums(hour_int);
			String sMin = hourtoStringService.getNums(min_int);
			String result = "It's " + sHour + " " + sMin;
			System.out.println(result);
			return result;
			}

		}

		catch (HourandminnotValid e) {
			System.out.println(e.getMsg());
			return e.getMsg();

		}

	}

}
