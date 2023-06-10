import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverName = "127.0.0.1";
        int serverPort = 8080;
        try (Socket socket = new Socket(serverName, serverPort);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            
            out.println("Hello Server! This is Client.");
            System.out.println("Server response: " + in.readLine());
        }
    }
}
