package el_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args)throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
		ELConfig rElConfig = context.getBean(ELConfig.class);
		rElConfig.outputResources();
		context.close();
	}
}
