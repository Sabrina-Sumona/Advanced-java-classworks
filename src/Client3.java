import java.io.*;
import java.net.*;

public class Client3
{

    private static Socket socket;

    public static void main(String[] args)
    {
        try
        {
            String host = "localhost";
            int port = 25000;
            InetAddress address = InetAddress.getByName(host);
            socket = new Socket(address, port);

            while (true) {
                InputStream is = socket.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                OutputStream os = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                String msg_in="";
                String msg_out="";
                while(!msg_in.equals("Bye")) {
                    msg_out = br.readLine();
                    dos.writeUTF(msg_out);
                    msg_in = dis.readUTF();
                    System.out.println("Server : "+msg_in);
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