package com.java.hacks.pattern.pool;

import java.io.IOException;
import java.net.Socket;

public class SocketPool extends ObjectPool<Socket> {
	
	private String host;
    private int port;
    
    public SocketPool(String host, int port, int minTotal, int maxTotal) {
		super(minTotal);
		
		setMaxTotal(maxTotal);
		
		this.host = host;
		this.port = port;
		
		initialize();
	}
    
    public Socket getConnectionFromPool() {
    	int size = pool.size();		
    	System.out.println("Total Max: " + getMaxTotal());
    	System.out.println("Total Min: " + getMinTotal());
		System.out.println("Pool Size: " + size);
				
		if (size > getMaxTotal()) {
			System.out.println("Pool is already full so cannot add any object to pool.");
			Socket socket = borrowObject();
			if (validate(socket)) {
				return socket;
			}
		}
		else if (size <= this.getMaxTotal()) {
			if (size == 0) {
				System.out.println("Pool is full.");
				return null;
			}			
			Socket socket = borrowObject();
			if (validate(socket)) {
				return socket;
			} else {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return socket;
			}
		}
		return null;
	}

	@Override
	protected Socket createObject() {		
		try {
			return new Socket(host, port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean validate(Socket socket) {
		Boolean isValid = Boolean.TRUE;
        if (socket == null || socket.isClosed() || !socket.isConnected()) {
        	isValid = Boolean.FALSE;
        }   
        return isValid;
	}

	@Override
	public void expire(Socket socket) {
		if (pool.contains(socket)) {
			pool.remove(socket);
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}