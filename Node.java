
public class Node<T> {
	
		private T item;  // Item value of a node..made of generics
		private Node<T> next;  // Reference to next node
		
		public Node(T item)  //constructor with only the item as input
		{
			this.item = item;
			this.next = null; 
		}
		
		public Node(T data, Node<T> nextNode) //full constructor
		{
			this.item = data; 			
			this.next = nextNode; 
		}
		
		public T getItem ()		//retrieve the item in node
		{
			return this.item; 
		}
		
		public void setItem(T item)
		{this.item = item;}
			
		public Node<T> getNext()	//retrieve the next Node
		{
			return this.next;
		}
		
		public void setNext(Node<T> next)
		{
			this.next = next;
		}
}
