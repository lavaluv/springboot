package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args)throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		AnnotationAop annotationAop = context.getBean(AnnotationAop.class);
		MethodAop methodAop = context.getBean(MethodAop.class);
		annotationAop.add();
		methodAop.add();
		context.close();
	}
}
