package bed_hour_to_String.Exception;

public class HourandminnotValid extends RuntimeException {
	
	String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public HourandminnotValid(String msg){
		this.msg=msg;
	}

}
