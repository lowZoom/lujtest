package luj.test.sut;

import luj.test.spring.RunnerTool;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

public class PreloadSut extends Statement {

  public PreloadSut(TestClass testClass, Statement next, RunnerTool runnerTool) {
    _testClass = testClass;
    _next = next;

    _runnerTool = runnerTool;
  }

  @Override
  public void evaluate() throws Throwable {
    _runnerTool.preloadSut(_testClass);

    _next.evaluate();
  }

  private final TestClass _testClass;
  private final Statement _next;

  private final RunnerTool _runnerTool;
}
