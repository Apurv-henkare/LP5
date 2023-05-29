import java.io.*;

import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            // Create a Socket and connect it to the server's IP address and port
            Socket socket = new Socket("localhost", 5000);
            
            // Create input and output streams for communication with the server
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            
            // Start reading messages from the user and sending them to the server
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;
            while ((message = userInput.readLine()) != null) {
                output.println(message);
                System.out.println("Server response: " + input.readLine());
            }
            
            // Close the connections
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

