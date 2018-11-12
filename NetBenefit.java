import java.io.*;
import java.util.*;

public class NetBenefit {

	public static void main(String[] args)throws IOException {
		 if (args.length!=1)
		  {
			System.err.println("Wrong set of arguments.Please input ONLY ONE path to html document");  
			System.exit(1);
		  }
		  else 
		  {		
			  StringStackImpl stack = new StringStackImpl();
			  String filePath = args[0];
			  
			  if(!filePath.endsWith(".html"))
			  	{	
				  System.err.println("Wrong type of file. Run the programme again!");
				  System.exit(1);
			  	}
			 File file = new File(filePath);  
		  
			  Scanner scanner = new Scanner(file);
			  int iterator =1;
			  while(scanner.hasNext())
			  	{			  
				  String token = scanner.next();}

	}
	
}
}