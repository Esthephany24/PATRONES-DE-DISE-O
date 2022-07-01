package objectpool.impl.poolable;

public interface IObjectPool<T extends IPooledObject> {
 public T getObject() throws PoolException;
 public void releaceObject(T pooledObject);
 }