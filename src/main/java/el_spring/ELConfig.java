package el_spring;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("el_spring")
@PropertySource("classpath:el_spring/test.properties")
public class ELConfig {
	@Value("some value")
	private String nString;
	@Value("#{systemProperties['os.name']}")
	private String osNameString;
	@Value("#{ T(java.lang.Math).random() * 100}")
	private double randomNum;
	@Value("#{ELService.getString()}")
	private String fromService;
	@Value("classpath:el_spring/test.txt")
	private Resource testFile;
	@Value("https://www.baidu.com")
	private Resource testURL;
	//注入配置文件信息需要配置PropertySource,可以用@Autowired或@Value注入
	@Autowired
	private Environment environment;
	
	@Value("${book.name}")
	private String bookName;
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	public void outputResources() {
		try {
			System.out.println(nString);
			System.out.println(osNameString);
			System.out.println(randomNum);
			System.out.println(fromService);
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testURL.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
