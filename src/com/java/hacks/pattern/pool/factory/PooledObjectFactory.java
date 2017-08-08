package com.java.hacks.pattern.pool.factory;

public interface PooledObjectFactory<OBJECT> {
	PooledObject<OBJECT> makeObject();

	void destroyObject(PooledObject<OBJECT> p);

	boolean validateObject(PooledObject<OBJECT> p);

	void activateObject(PooledObject<OBJECT> p);

	void passivateObject(PooledObject<OBJECT> p);
}
