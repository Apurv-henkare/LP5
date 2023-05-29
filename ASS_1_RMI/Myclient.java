import java.rmi.*;
import java.rmi.registry.*; 


public class Myclient 
{ 
	public static void main(String args[]) 
	{    
	
		try
		{
			Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo"); 
			System.out.println(stub.add(12,32));
		}
		
		catch(Exception e) 
		{
		}
		
		
	}

}
