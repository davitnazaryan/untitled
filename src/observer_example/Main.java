package observer_example;
import observer_example.clients.Client1;
import observer_example.clients.Client2;
import observer_example.clients.Client3;
import observer_example.server.Server;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Server server = new Server();
        Client1 client1 = new Client1();
        Client2 client2 = new Client2();
        Client3 client3 = new Client3();

        server.addClient(client1);
        server.addClient(client2);
        server.addClient(client3);


        InputStream in = System.in;
        InputStreamReader inReader = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(inReader);
        String str;
        while ((str = reader.readLine()) != null) {
            server.setMessage(str);
        }
    }
}
