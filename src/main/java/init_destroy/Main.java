package init_destroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args)throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		BeanWay beanWay = context.getBean(BeanWay.class);
		JSR250Way jsr250Way = context.getBean(JSR250Way.class);
		context.close();
	}
}
