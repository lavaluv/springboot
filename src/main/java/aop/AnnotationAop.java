package aop;

import org.springframework.stereotype.Service;

@Service
public class AnnotationAop {
	@Action(name = "Annotation AOP add()")
	public void add() {
		
	}
}
