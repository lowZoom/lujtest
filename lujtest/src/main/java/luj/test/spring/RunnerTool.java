package luj.test.spring;

import luj.test.sut.SutInjector;
import luj.test.sut.SutPreloader;
import org.junit.runners.model.TestClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunnerTool {

  public void preloadSut(TestClass testClass) {
    _sutPreloader.preload(testClass);
  }

  public void injectSut(Object test) {
    _sutInjector.inject(test);
  }

  @Autowired
  private SutPreloader _sutPreloader;

  @Autowired
  private SutInjector _sutInjector;
}
