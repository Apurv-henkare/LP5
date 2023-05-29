import java.io.*;
import java.net.*;


public class server 
{

	public static void main(String args[])
	{
	
		try
		{ 
		  
		  ServerSocket serverSocket=new ServerSocket(5000);
		   
		  System.out.println("server started and waiting for client responce") ;
		  
		  
		  Socket clientSocket=serverSocket.accept();
		  System.out.println("Clinet cnnec") ;
		  
		  
		  // Create input output stream 
		  
		  BufferedReader input=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		  PrintWriter output=new PrintWriter(clientSocket.getOutputStream(),true);
		  
		  
		  String message;
		  
		  while((message=input.readLine())!=null)
		  {
		  
		  	System.out.println("received message from client "+message);
		  	output.println("server received "+message);
		 }
		  
		  
		  input.close();
		  output.close();
		  serverSocket.close();
		  clientSocket.close() ;
		  
		
		
		
		}
		
		catch(Exception e)
		
		{
		
		}
		
		
		
		
	}
	




}
