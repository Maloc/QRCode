/**
	QRCode allows us to create, display and modify(soon) our own QRCode.
	@autor Guillaume HOARAU and IT.Sligo.
	@version 1.0.0
	@date 04/05/2016
*/

package main;

/**
 * This class parses information to catch the room.
 */
public class Room {
	private String room, delims;
	private String[] tokens;

	/** Constructor of our class.*/
	public Room() {
		
	}
	
	/** Catch the room.*/
	public String get(String data)
	{
		delims = "[ ]+";
		tokens = data.split(delims);
		room = tokens[tokens.length-1];
		
		return(room);
	}

}
