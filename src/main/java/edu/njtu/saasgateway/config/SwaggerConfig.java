package edu.njtu.saasgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import java.util.Collections;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*@Configuration
@EnableSwagger2*/
public class SwaggerConfig {
	/*@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()
	      .apis(RequestHandlerSelectors.basePackage("com.androidlesson.gymService.rest"))
	      .paths(PathSelectors.ant("/api/trainers/*"))
	      .build()
	      .apiInfo(apiInfo());
	}  

    private ApiInfo apiInfo() {
        return new ApiInfo(
          "My REST API", 
          "My Rest API consists api for user registry, api for private trainer and api for movies.", 
          "API TOS", 
          "Terms of service", 
          new Contact("Admin", "www.bjtu.edu.cn", "myeaddress@bjtu.edu.cn"), 
          "License of API", "API license URL", Collections.emptyList());
   }*/
}