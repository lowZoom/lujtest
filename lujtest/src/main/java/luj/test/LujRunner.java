package luj.test;

import luj.test.spring.RunnerTool;
import luj.test.spring.RunnerToolGetter;
import luj.test.sut.PreloadSut;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

@Deprecated
public class LujRunner extends BlockJUnit4ClassRunner {

  public LujRunner(Class<?> klass) throws InitializationError {
    super(klass);

    _runnerTool = new RunnerToolGetter(klass).get();
  }

  @Override
  protected Statement withBeforeClasses(Statement statement) {
    Statement junitStat = super.withBeforeClasses(statement);
    return new PreloadSut(getTestClass(), junitStat, _runnerTool);
  }

  @Override
  protected Statement methodInvoker(FrameworkMethod method, Object test) {
    _runnerTool.injectSut(test);
    return super.methodInvoker(method, test);
  }

  private final RunnerTool _runnerTool;
}
