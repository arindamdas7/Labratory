package exceptionhandling;

public class AgeIsNotEligibleException extends RuntimeException 
{
	public AgeIsNotEligibleException(String messege)
	{
		super(messege);
	}
	
}
