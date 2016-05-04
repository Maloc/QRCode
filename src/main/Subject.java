/**
	QRCode allows us to create, display and modify(soon) our own QRCode.
	@autor Guillaume HOARAU and IT.Sligo.
	@version 1.0.0
	@date 04/05/2016
*/

package main;

/**
 *  This class catches the subject of our QRCode.
 */
public class Subject {
	private String subject, delims;
	private String[] tokens;

	/**Constructor of our class.*/
	public Subject() {
		
	}
	
	/**Parce the information.*/
	public String get(String data)
	{
		delims = "[\n:]+";
		tokens = data.split(delims);
		subject = tokens[tokens.length-3];
		
		return(subject);
	}

}
