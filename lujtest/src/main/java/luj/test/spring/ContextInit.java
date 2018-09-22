package luj.test.spring;

import java.util.List;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.test.context.ContextConfigurationAttributes;
import org.springframework.test.context.ContextCustomizer;
import org.springframework.test.context.ContextCustomizerFactory;
import org.springframework.test.context.MergedContextConfiguration;

public class ContextInit implements ContextCustomizerFactory, ContextCustomizer {

  @Override
  public ContextCustomizer createContextCustomizer(Class<?> testClass,
      List<ContextConfigurationAttributes> configAttributes) {
    return this;
  }

  @Override
  public void customizeContext(ConfigurableApplicationContext ctx,
      MergedContextConfiguration config) {
    ctx.getBeanFactory().registerSingleton(
        AnnotationConfigUtils.CONFIGURATION_BEAN_NAME_GENERATOR, new NameGen());
  }
}
