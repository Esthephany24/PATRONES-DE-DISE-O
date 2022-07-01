package objectpool.impl;

public class ExecutorThreadPool extends AbstractObjectPool<ExecutorTask>{

        public ExecutorThreadPool(int minInstances, int maxInstances, int waitTime,
            IPoolableObjectFactory<ExecutorTask> poolableObjectFactory) {
          super(minInstances, maxInstances, waitTime, poolableObjectFactory);
        }