package com.java.hacks.pattern.pool.factory;

import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class GenericObjectPool<OBJECT> implements ObjectPool<OBJECT> {

	protected ConcurrentLinkedQueue<OBJECT> pool = new ConcurrentLinkedQueue<>();
	protected int maxTotal;
	protected int maxIdle;
	protected int minIdle;    
	
	protected PooledObjectFactory<OBJECT> factory;

	public GenericObjectPool(final int minObjectSize, final int maxObjectSize) {
		initialize(minObjectSize);
	}
	
	public GenericObjectPool(PooledObjectFactory<OBJECT> factory) {
		this(factory, new PoolConfig());
	}
	
	 public GenericObjectPool(PooledObjectFactory<OBJECT> factory,
	           PoolConfig config) {
		 this.factory = factory;
		 setConfig(config);
	 }

	private void setConfig(PoolConfig config) {
		setMaxIdle(config.getMaxIdle());
        setMinIdle(config.getMinIdle());
        setMaxTotal(config.getMaxTotal());
        
        initialize(config.getMinIdle());
	}

	private void initialize(int minObjectSize) {
		for (int i = 0; i < minObjectSize; i++) {  
            pool.add(createObject());  
        }  
	}

	@Override
	public OBJECT borrowObject() {
		OBJECT object;
		if ((object = pool.poll()) == null) {
			object = createObject();
		}
		return object;
	}

	@Override
	public void returnObject(OBJECT object) {
		if (object == null) {
			return;
		}
		pool.offer(object);
	}

	@Override
	public void close() {
		pool.clear();
	}

	@Override
	public void clear() {
		pool.clear();
	}

	//protected abstract OBJECT createObject();

	public int getMaxTotal() {
		return maxTotal;
	}

	public void setMaxTotal(int maxTotal) {
		this.maxTotal = maxTotal;
	}

	public int getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}

	public int getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}	
	
	@Override
	public void invalidateObject(OBJECT obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addObject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumIdle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumActive() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OBJECT createObject() {
		// TODO Auto-generated method stub
		return null;
	}
}
