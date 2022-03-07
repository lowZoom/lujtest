package luj.test.sut;

import java.lang.reflect.Field;

public class SutInjectItem {

  public SutInjectItem(Object sutBean, Field sutField) {
    _sutBean = sutBean;
    _sutField = sutField;
  }

  public Object getSutBean() {
    return _sutBean;
  }

  public Field getSutField() {
    return _sutField;
  }

  private final Object _sutBean;

  private final Field _sutField;
}
