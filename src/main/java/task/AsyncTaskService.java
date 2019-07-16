package task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
//@Async 类下所有方法都设置为异步执行
public class AsyncTaskService {
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("Start Async task:"+i);
	}
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("Start Async plus:"+(i+1));
	}
}
