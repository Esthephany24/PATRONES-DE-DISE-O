package objectpool.impl.factory;

public interface IPoolableObjectFactory<T extends IPooledObject> {
    public T createNew();
    }