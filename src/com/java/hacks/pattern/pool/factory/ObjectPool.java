package com.java.hacks.pattern.pool.factory;

public interface ObjectPool<OBJECT> {
	OBJECT borrowObject();
	void invalidateObject(OBJECT obj);
	void returnObject(OBJECT obj);
	void addObject();
	int getNumIdle();
	int getNumActive();
	void clear();
	void close();
}
