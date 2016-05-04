/**
	QRCode allows us to create, display and modify(soon) our own QRCode.
	@autor Guillaume HOARAU and IT.Sligo.
	@version 1.0.0
	@date 04/05/2016
*/

package main;

/**
 * This class catches date and time from the information given by the user using parsing method.
 */
public class DateTime {
	private String dateTime, delims;
	private String[] tokens;
	
	/** Constructor of the class. */
	public DateTime() {
		
	}
	
	/** Use parsing method to catch these information. */
	public String get(String data)
	{
		delims = "[\n ]+";
		tokens = data.split(delims);
		dateTime = tokens[1]+", "+tokens[3]+" to "+tokens[5];
		
		return(dateTime);
	}

}

