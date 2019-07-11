package annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;
	public String say(String word) {
		return functionService.say(word);
	}
}
