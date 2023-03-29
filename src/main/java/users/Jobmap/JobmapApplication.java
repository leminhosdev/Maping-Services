package users.Jobmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "users.Jobmap")
public class JobmapApplication {
	public static void main(String[] args) {
		SpringApplication.run(JobmapApplication.class, args);
	}

}
