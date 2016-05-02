package main;

public class DateTime {
	private String dateTime, delims;
	private String[] tokens;

	public DateTime() {
		
	}
	
	public String get(String data)
	{
		delims = "[\n ]+";
		tokens = data.split(delims);
		dateTime = tokens[1]+", "+tokens[3]+" to "+tokens[5];
		
		return(dateTime);
	}

}

