package luj.test.sut;

import luj.test.anno.SUT;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.TestClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SutPreloader {

  public void preload(TestClass testClass) {
    FrameworkField sutField = findSutField(testClass);
    SutInjectItem injectItem = toInjectItem(sutField);
    _sutInjectMap.put(testClass.getJavaClass(), injectItem);
  }

  private FrameworkField findSutField(TestClass testClass) {
    return testClass.getAnnotatedFields(SUT.class).get(0);
  }

  private SutInjectItem toInjectItem(FrameworkField sutField) {
    Class<?> fieldType = sutField.getType();
    Object sutBean = _applicationContext.getBean(fieldType);
    return new SutInjectItem(sutBean, sutField.getField());
  }

  @Autowired
  private ApplicationContext _applicationContext;

  @Autowired
  private SutInjectMap _sutInjectMap;
}
