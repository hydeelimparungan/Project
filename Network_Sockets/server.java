package Network_Sockets;

import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started, waiting for client...");

            
            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            
            String messageFromClient = input.readLine();
            System.out.println("Received from client: " + messageFromClient);

           
            String response = "Hello from Server!";
            output.println(response);

           
            input.close();
            output.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
