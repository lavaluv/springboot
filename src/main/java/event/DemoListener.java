package event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
	public void onApplicationEvent(DemoEvent event) {
		String mString= event.getMsString();
		System.out.println("demoListener get demoEvent msg:"+mString);
	}
}
