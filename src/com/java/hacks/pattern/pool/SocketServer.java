package com.java.hacks.pattern.pool;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class SocketServer {

	public static void main(String args[]) throws IOException {
		ServerSocket listener = new ServerSocket(1234);
		try {
			while (true) {
				Socket socket = listener.accept();
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println("Message Received at: " + LocalDateTime.now().toString());
					out.println();
				} finally {
					socket.close();
				}
			}
		} finally {
			listener.close();
		}

	}
}
