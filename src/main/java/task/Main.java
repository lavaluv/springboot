package task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String args[])throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfig.class);
		AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
		for(int i = 0;i<10;i++) {
			taskService.executeAsyncTask(i);
			taskService.executeAsyncTaskPlus(i);
		}
		context.close();
	}
}
