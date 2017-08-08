package com.java.hacks.pattern.pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class ObjectPool<T> {
	
	private int minTotal = 0;
	private int maxTotal = 0;
	private int minIdle = 0;
	private int maxIdle = 0;
	
	protected ConcurrentLinkedQueue<T> pool = new ConcurrentLinkedQueue<>();
	
	public int getFreeConnections() {
		return pool.size();
	}

	public ObjectPool(final int minTotal) {
		setMinTotal(minTotal);
	}

	public ObjectPool(final int minTotal, final int maxTotal) {
		setMinTotal(minTotal);
		setMaxTotal(maxTotal);
	}
	
	protected void initialize() {
		if (maxTotal >= minTotal) {
			for (int i = 0; i < maxTotal; i++) {  
	            pool.add(createObject());  
	        }	
		} else {
			for (int i = 0; i < minTotal; i++) {  
				pool.add(createObject());  
			}  
		}
	}
	
	protected abstract T createObject();  
	  
	public abstract boolean validate(T o);

	public abstract void expire(T o);

	public T borrowObject() { 
        T object;  
        if ((object = pool.poll()) == null)  
        {  
        	object = createObject();  
        }  
        return object;  
    }  
	
	public void returnObject(T object) {  
        if (object == null) {  
            return;  
        } 
        pool.offer(object);  
    }  

	public int getMinTotal() {
		return minTotal;
	}

	public void setMinTotal(int minTotal) {
		this.minTotal = minTotal;
	}

	public int getMaxTotal() {
		return maxTotal;
	}

	public void setMaxTotal(int maxTotal) {
		this.maxTotal = maxTotal;
	}

	public int getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}

	public int getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}	
	
}