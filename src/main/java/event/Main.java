package event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String args[])throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		Demopublisher demopublisher = context.getBean(Demopublisher.class);
		demopublisher.publish("hbq");
		context.close();
	}
}
