package com;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "127.0.0.1";

        int port = 8089;

        try {
            Socket client = new Socket(host, port);
            OutputStream out = client.getOutputStream();
            out.write("Hello cgrw！".getBytes());
            out.flush();
            out.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}