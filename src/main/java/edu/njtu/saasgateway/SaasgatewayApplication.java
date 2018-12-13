package edu.njtu.saasgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.battcn.swagger.annotation.EnableSwagger2Doc;

@RestController
@SpringBootApplication
@EnableSwagger2Doc
public class SaasgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaasgatewayApplication.class, args);
	}
	
//	@Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        // 目的是
//        return args -> {
//            System.out.println("来看看 SpringBoot 默认为我们提供的 Bean：");
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            Arrays.stream(beanNames).forEach(System.out::println);
//        };
//    }
}
