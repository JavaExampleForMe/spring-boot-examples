package com.example.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({EmpConfig.class})
public class EmpApplication {


	public static void main(String[] args) {
		final ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(EmpApplication.class, args);
		final String[] beans = configurableApplicationContext.getBeanDefinitionNames();
/*		Arrays.sort(beans);
		for (String bean : beans) {
			System.out.println(bean);
		}*/
	}
}
