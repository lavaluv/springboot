package scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args)throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		SingletonService singletonService1 = context.getBean(SingletonService.class);
		SingletonService singletonService2 = context.getBean(SingletonService.class);
		PrototypeService pService1 = context.getBean(PrototypeService.class);
		PrototypeService pService2 = context.getBean(PrototypeService.class);
		System.out.println("s1 ?== s2 "+ singletonService1.equals(singletonService2));
		System.out.println("p1 ?== p2 "+ pService1.equals(pService2));
		context.close();
	}
}
