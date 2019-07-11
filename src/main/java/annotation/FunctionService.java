package annotation;
import org.springframework.stereotype.Service;
@Service
public class FunctionService {
	public String say(String word) {
		return word;
	}
}
