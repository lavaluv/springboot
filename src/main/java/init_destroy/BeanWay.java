package init_destroy;

public class BeanWay {
	public void init() {
		System.out.println("@Bean-init-method");
	}
	public BeanWay() {
		super();
		System.out.println("初始化构造函数-BeanWay");
	}
	public void destroy() {
		System.out.println("Bean-destroy-method");
	}
}
