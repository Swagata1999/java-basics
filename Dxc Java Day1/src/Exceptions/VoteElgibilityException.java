package Exceptions;

public class VoteElgibilityException extends Exception{

	public VoteElgibilityException(String message) {
		super("ineligible to vote this year");
	}
	
	

}