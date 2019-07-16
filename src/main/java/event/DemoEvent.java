package event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent{
	private static final long serialVersionUID = 1L;
	private String msgString;
	public DemoEvent(Object source,String mString) {
		super(source);
		this.msgString = mString;
	}
	public String getMsString() {
		return msgString;
	}
	public void setMsString(String mString) {
		this.msgString = mString;
	}
}
