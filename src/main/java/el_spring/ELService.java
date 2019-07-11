package el_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ELService {
	@Value("其他类属性")
	private String anString;
	public String getString() {
		return anString;
	}
	public void setAnother(String anString) {
		this.anString = anString;
	}
}
