package luj.test;

import luj.test.spring.InjectConf;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

@RunWith(LujRunner.class)
@TestExecutionListeners // 去除Spring默认执行监听器
@ContextConfiguration(
    classes = InjectConf.class
    //loader =
)
public abstract class LujTest {

  //@Before
  //public void setup0() {
  //  // 利用多态取到实际的子类
  //  ReflectionUtils.doWithFields(getClass(), this::resetMock);
  //}
  //
  //private void resetMock(Field f) throws IllegalAccessException {
  //  if (f.getModifiers() != 0 || f.getAnnotation(InjectMock.class) == null) {
  //    return;
  //  }
  //  f.setAccessible(true);
  //  reset(f.get(this));
  //}
}
