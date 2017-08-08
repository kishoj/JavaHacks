package com.java.hacks.pattern.pool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MainApp {

	public static void main(String[] args) {
		SocketPool pool = new SocketPool("localhost", 1234, 3, 5);

		Socket socket1 = pool.getConnectionFromPool();
		try {
			String response = sendMessage(socket1, "Client 1");
			System.out.println("Message received from TCP Socket server : " + response);
		} catch (IOException e) {
			pool.returnObject(socket1);
			e.printStackTrace();
		}

		Socket socket2 = pool.getConnectionFromPool();
		try {
			String response = sendMessage(socket2, "Client 2");
			System.out.println("Message received from TCP Socket server : " + response);
		} catch (IOException e) {
			pool.returnObject(socket2);
			e.printStackTrace();
		}

		Socket socket3 = pool.getConnectionFromPool();
		try {
			String response = sendMessage(socket3, "Client 3");
			System.out.println("Message received from TCP Socket server : " + response);
		} catch (IOException e) {
			pool.returnObject(socket3);
			e.printStackTrace();
		}

		Socket socket4 = pool.getConnectionFromPool();
		try {
			String response = sendMessage(socket4, "Client 4");
			System.out.println("Message received from TCP Socket server : " + response);
		} catch (IOException e) {
			pool.returnObject(socket4);
			e.printStackTrace();
		}

		Socket socket5 = pool.getConnectionFromPool();
		try {
			String response = sendMessage(socket5, "Client 5");
			System.out.println("Message received from TCP Socket server : " + response);
		} catch (IOException e) {
			pool.returnObject(socket5);
			e.printStackTrace();
		}

		Socket socket6 = pool.getConnectionFromPool();
		if (socket6 != null) {
			try {
				String response = sendMessage(socket6, "Client 6");
				System.out.println("Message received from TCP Socket server : " + response);
			} catch (NullPointerException e) {
				pool.returnObject(socket6);
				e.printStackTrace();
			} catch (IOException e) {
				pool.returnObject(socket6);
				e.printStackTrace();
			}
		} else {
			System.out.println("Pool is full so cannot create object for socket 6.");
		}

		Socket socket7 = pool.getConnectionFromPool();
		if (socket7 != null) {
			try {
				String response = sendMessage(socket7, "Client 7");
				System.out.println("Message received from TCP Socket server : " + response);
			} catch (NullPointerException e) {
				e.printStackTrace();
				pool.returnObject(socket7);
			} catch (IOException e) {
				pool.returnObject(socket7);
				e.printStackTrace();
			}
		} else {
			System.out.println("Pool is full so cannot create object for socket 7.");
		}

		pool.returnObject(socket1);
		pool.returnObject(socket2);

		Socket socket8 = pool.getConnectionFromPool();
		try {
			String response = sendMessage(socket8, "Client 6");
			System.out.println("Message received from TCP Socket server : " + response);
		} catch (NullPointerException e) {
			pool.returnObject(socket8);
			e.printStackTrace();
		} catch (IOException e) {
			pool.returnObject(socket8);
			e.printStackTrace();
		}

	}

	private static String sendMessage(Socket socket, String message) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write(message + "\n");
		bw.flush();
		System.out.println("Message sent to TCP Socket Server : " + message);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String response = br.readLine();
		bw.close();
		br.close();
		return response;
	}

}
