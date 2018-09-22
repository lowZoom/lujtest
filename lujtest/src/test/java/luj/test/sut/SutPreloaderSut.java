package luj.test.sut;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class SutPreloaderSut {

  @PostConstruct
  void init() {
    _init = true;
  }

  boolean _init;

  @Autowired
  SutPreloader _sutPreloader;

  @Autowired
  SutInjectMap _sutInjectMap;
}
