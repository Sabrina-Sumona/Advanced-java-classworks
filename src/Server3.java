import java.io.*;
import java.net.*;
public class Server3 {

    private static Socket socket;

    public static void main(String[] args) {
        try {
            int port = 25000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server Started and listening to the port 25000");

            while (true) {
                socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                OutputStream os = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                String msg_in="";
                String msg_out="";
                while(!msg_in.equals("Bye")) {
                    msg_in = dis.readUTF();
                    System.out.println("Client : "+msg_in);
                    msg_out = br.readLine();
                    dos.writeUTF(msg_out);
                    dos.flush();
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch(Exception e){}
        }
    }
}