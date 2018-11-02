
public class EmptyListException extends RuntimeException {
	/**
	 * Default constructor, calls constructor with parameter name set to "List"
	 */
	public EmptyListException()
	{
		this( "List" ); // call other EmptyListException constructor
	} // end EmptyListException no-argument constructor

	/**
	 * Constructor with list's name, calls RuntimeException(String)
	 * @param name the list name
	 */
	public EmptyListException( String name )
	{
		super( name + " is empty" ); // call superclass constructor
	} 

}
