package init_destroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("init_destroy")
public class PrePostConfig {
	@Bean(initMethod = "init",destroyMethod = "destroy")
	BeanWay beanWay() {
		return new BeanWay();
	}
	@Bean
	JSR250Way jsr250Way() {
		return new JSR250Way();
	}
}
