package luj.test.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
    lazyInit = true,
    //nameGenerator = NameGen.class,
    basePackages = {
        "luj.test",
        "luj.ava",
    })
public class InjectConf {

}
