package luj.test.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.test.context.TestContextManager;

public class RunnerToolGetter {

  public RunnerToolGetter(Class<?> testClass) {
    _testClass = testClass;
  }

  public RunnerTool get() {
    return getSpringContext(_testClass).getBean(RunnerTool.class);
  }

  private BeanFactory getSpringContext(Class<?> testClass) {
    TestContextManager ctxMgr = new TestContextManager(testClass);
    return ctxMgr.getTestContext().getApplicationContext();
  }

  private final Class<?> _testClass;
}
