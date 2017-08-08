package com.java.hacks.pattern.pool.factory;

import java.net.Socket;

public class SocketPool extends GenericObjectPool<Socket> {

	public SocketPool(PooledObjectFactory<Socket> factory) {
		super(factory);
		initializeDefaultPoolConfig();
	}
	
	public SocketPool(PooledObjectFactory<Socket> factory, PoolConfig config) {
		super(factory, config);
	}

	private void initializeDefaultPoolConfig() {
		this.setMinIdle(1);
		this.setMaxIdle(2);
		this.setMaxTotal(3);
	}	

}
