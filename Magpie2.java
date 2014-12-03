/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mr.") >= 0
				|| statement.indexOf("mr") >= 0
				|| statement.indexOf("Mrs.") >= 0
				|| statement.indexOf("mrs") >= 0
				|| statement.indexOf("Ms.") >= 0
				|| statement.indexOf("ms") >= 0)
		{
			response = "Your teacher sounds like a rad dude.";
		}
		else if (statement.trim().length() == 0)
		{
			response = "Say something, I'm giving up on you~.";
		}
		else if (statement.indexOf("Gardevoir") >= 0
				|| statement.indexOf("gardevoir") >= 0)
		{
			response = "WHOA DAS LIKE THE BEST POKEMON EVER.";
		}
		else if (statement.indexOf("tea") >= 0)
		{
			response = "My favourite tea is Blueberry.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Did you know that a group of ferrets is called a business (ie. a business of ferrets)?";
		}
		else if (whichResponse == 5)
		{
			response = "Did you know that the Kalos region of Pokemon is based off of France?";
		}
		return response;
	}
}
