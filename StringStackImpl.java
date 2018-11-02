import java.io.PrintStream;
import java.util.NoSuchElementException;


public class StringStackImpl implements StringStack {
	
	private LinkedList<String> stringStack;
	
	public StringStackImpl()
	{
		this.stringStack = new LinkedList<String>("Stack");
	}
	
	
	public boolean isEmpty() 
	{
		if (stringStack.isEmpty())
			return true;
		else
			return false;
	}

	
	public void push(String item)  //einai stoiba ara opos mpainei etsi kai 8a bgei to stoixeio ara 8a xrisimopoihsoume atFront methodous
	{
		stringStack.insertAtFront(item);

	}

	
	public String pop() throws NoSuchElementException {
		if (isEmpty()) throw new NoSuchElementException("ERROR!!! The stack is empty!!! ");
		else 
			return stringStack.removeFromFront();
		
	}

	
	public String peek() throws NoSuchElementException 
	{
		if (isEmpty()) throw new NoSuchElementException("ERROR!!! The stack is empty!!! ");
		else 
			return stringStack.scanHead();
	}

	
	public void printStack(PrintStream stream) {
		
	}

	
	
	public int size() {
		if (stringStack.isEmpty())
			return 0;
		else 
			return stringStack.size();
	}

}
