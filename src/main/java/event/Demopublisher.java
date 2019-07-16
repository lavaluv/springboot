package event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Demopublisher {
	@Autowired
	ApplicationContext aplApplicationContext;
	public void publish(String mString) {
		aplApplicationContext.publishEvent(new DemoEvent(this, mString));
	}
}
