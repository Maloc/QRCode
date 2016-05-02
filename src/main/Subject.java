package main;

public class Subject {
	private String subject, delims;
	private String[] tokens;

	public Subject() {
		
	}
	
	public String get(String data)
	{
		delims = "[\n:]+";
		tokens = data.split(delims);
		subject = tokens[tokens.length-3];
		
		return(subject);
	}

}
