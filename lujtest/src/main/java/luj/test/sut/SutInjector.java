package luj.test.sut;

import java.lang.reflect.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SutInjector {

  public void inject(Object test) {
    Class<?> testClass = test.getClass();
    SutInjectItem injectItem = _sutInjectMap.get(testClass);

    if (injectItem == null) {
      return;
    }

    Field field = injectItem.getSutField();
    Object sutBean = injectItem.getSutBean();

    try {
      field.setAccessible(true);
      field.set(test, sutBean);
    } catch (IllegalAccessException e) {
      throw new UnsupportedOperationException(e);
    }
  }

  @Autowired
  private SutInjectMap _sutInjectMap;
}
