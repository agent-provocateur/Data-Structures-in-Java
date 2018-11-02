import java.util.*;
import java.io.*; 

public class LinkedList<T>
{
	private Node<T> head; 
	private Node<T> tail;
	private int sizeCounter;
	private String listName;
	
	public LinkedList()
	{
		head = tail = null;
		sizeCounter = 0;
		listName = "list";
	}
	
	public LinkedList(String name)
	{
		head = tail = null;
		sizeCounter = 0;
		this.listName = name;
	}
	
	
	public boolean isEmpty()
	{
		if (sizeCounter == 0)
			return true;
		
		return false;
	}
	
	public int size()
	{
		return this.sizeCounter;
	}
	
	
	public T scanHead()
	{
		return this.head.getItem();
	}
	
	public T scanBack()
	{
		return tail.getItem();
	}
	
	public void insertAtFront(T item)
	{
		Node<T> node = new Node<T>(item);
		
		if (isEmpty())
		{
			head = tail = node;
			sizeCounter = 1;
		} 
		
		else 
		{	node.setNext(head);
			head = node;
			++sizeCounter;
		}
	 
	}
	
	public void insertAtBack(T item)
	{
		Node<T> node = new Node<T>(item);
		
		if (isEmpty())
		{
			head = tail = node; 
			sizeCounter = 1; 
		} 
		
		else 
		{
			tail.setNext(node); 
			tail = node;
			++sizeCounter;
		}
	 }
	
	
	public T removeFromFront() throws EmptyListException
	{
		if (isEmpty())
			throw new EmptyListException(listName);
		
		T removedItem = head.getItem();
		
		if (head==tail){
			head = tail = null;
			sizeCounter=0;}
		else 
		{
			Node<T> tmp = head.getNext();
			head = tmp; 
			--sizeCounter;
		}
		
		return removedItem;
	}
	
	public T removeFromBack() throws EmptyListException
	{
		if (isEmpty())
			throw new EmptyListException(listName);
		
		T removedItem = tail.getItem();
		
		if (head==tail)
			{
			head = tail = null;
			sizeCounter=0;}
		else 
		{
			Node<T> tmp = head; 
			while (tmp.getNext()!=tail)
				tmp = tmp.getNext();
			
			tail = tmp;
			tmp.setNext(null);
			--sizeCounter;
		}
		
		return removedItem;
	}


	public void print() 
	{
		if (isEmpty()) 
		{
			System.out.printf("Empty %s\n", listName);
			return;
		} 														// end if

		System.out.printf("The %s is: ", listName);
		Node<T> current = head;

																// while not at end of list, output current node's data
		while (current != null) 
		{
			System.out.printf("%s ", current.getItem());
			current = current.getNext();
		}														// end while

		System.out.println("\n");
		
	}
}