package Network_Sockets;

import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
           
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            
            String messageToSend = "Hello from Client!";
            output.println(messageToSend);

          
            String responseFromServer = input.readLine();
            System.out.println("Received from server: " + responseFromServer);
            
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
