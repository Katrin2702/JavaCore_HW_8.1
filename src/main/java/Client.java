import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        try (Socket clientSocket = new Socket("127.0.0.1", 8080);
             PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("User");
            System.out.println(in.readLine());
        }
    }
}
