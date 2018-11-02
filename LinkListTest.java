import java.util.*;

public class LinkListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList<String> stringList = new LinkedList<String>("Stack");
		
		System.out.println("Hello checking list");
		String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		a1 = "hello";
		a2 = "there";
		a3 = "name"; 
		a4 = "fuck";
		a5 = "you";
		a6 = "nazi";
		a7 = "fascist";
		a8 = "gay";
		a9 = "nigger";
		a10 = "faggot";
		
		System.out.println("First try");
		stringList.insertAtFront(a1);
		stringList.insertAtBack(a3);
		stringList.insertAtFront(a5);
		stringList.insertAtBack(a9);
		stringList.insertAtFront(a10);
		stringList.print();
		System.out.printf("The size of list is %d",stringList.size());
		
		System.out.println("\n\nSecond try");
		
		String tmp = stringList.removeFromFront();
		String tmp2 = stringList.removeFromBack();
			
		stringList.print();
		System.out.println("\ntmp is "+tmp+" and tmp2 is "+tmp2);
		System.out.printf("The size of list is %d",stringList.size());

		}

}
