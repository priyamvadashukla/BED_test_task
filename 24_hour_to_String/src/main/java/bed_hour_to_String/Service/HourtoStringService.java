package bed_hour_to_String.Service;

public class HourtoStringService {
	
	
		 public String getNums(int index) {
			 if(index>=0 && index<=59) {
				 return nums[index];
			 }
			 else {
				 return "number does not exist";
			 }
		
	}

	public void setNums(String[] nums) {
		this.nums = nums;
	}

		String nums[] = { "zero", "one", "two", "three", "four",
                 "five", "six", "seven", "eight", "nine",
                 "ten", "eleven", "twelve", "thirteen",
                 "fourteen", "fifteen", "sixteen", "seventeen",
                 "eighteen", "nineteen", "twenty", "twenty one",
                 "twenty two", "twenty three", "twenty four",
                 "twenty five", "twenty six", "twenty seven",
                 "twenty eight", "twenty nine","thirty","thirty one","thirty Two","thirty three","thirty four",
                 "thirty five","thirty six","thirty seven","thirty eight","thirty nine","fourty",
          "fourty one","fourty two","fourty three","fourty four","fourty five","fourty six","fourty seven","fourty eight",
          "fourty nine","fifty","fifty one","fifty Two","fifty Three","fifty four","fifty five","fifty six","fifty Seven","fifty eight",
          "fifty nine"};

}
