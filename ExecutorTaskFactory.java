package objectpool.impl.factory;

public class ExecutorTaskFactory implements IPoolableObjectFactory<ExecutorTask>{
    public ExecutorTask createNew(){
        return new ExecutorTask();
    }
}