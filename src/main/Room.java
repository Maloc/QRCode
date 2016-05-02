package main;

public class Room {
	private String room, delims;
	private String[] tokens;

	public Room() {
		
	}
	
	public String get(String data)
	{
		delims = "[ ]+";
		tokens = data.split(delims);
		room = tokens[tokens.length-1];
		
		return(room);
	}

}
