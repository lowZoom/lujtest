package luj.test.sut;

import static org.assertj.core.api.Assertions.assertThat;

import luj.test.LujTest;
import luj.test.anno.SUT;
import org.junit.Test;

public class SutPreloaderTest extends LujTest {

  @SUT
  SutPreloaderSut _sut;

  @Test
  public void preload_() {
    //-- Arrange --//

    //-- Act --//
    // 已在LujRunner中运行

    //-- Assert --//
    assertThat(_sut._init).isTrue();
    assertThat(preloaded()).isSameAs(_sut);
  }

  Object preloaded() {
    return _sut._sutInjectMap.get(SutPreloaderTest.class).getSutBean();
  }
}
