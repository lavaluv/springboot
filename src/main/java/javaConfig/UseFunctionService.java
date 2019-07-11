package javaConfig;
import javaConfig.FunctionService;
public class UseFunctionService {
	FunctionService functionService;
	public void setFunctionService(FunctionService in) {
		this.functionService = in;
	}
	public String say(String word) {
		return functionService.say(word);
	}
}
