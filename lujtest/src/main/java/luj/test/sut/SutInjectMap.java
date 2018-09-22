package luj.test.sut;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class SutInjectMap {

  public SutInjectMap() {
    _injectMap = new HashMap<>();
  }

  public void put(Class<?> key, SutInjectItem value) {
    _injectMap.put(key, value);
  }

  public SutInjectItem get(Class<?> testClass) {
    return _injectMap.get(testClass);
  }

  private final Map<Class<?>, SutInjectItem> _injectMap;
}
