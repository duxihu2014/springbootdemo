package smm.springboot_ftl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import smm.springboot_ftl.action.UserController;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args){
		SpringApplication.run(Application.class,args);

//		SpringApplication springApplication = new SpringApplication(Application.class);
//		springApplication.setBannerMode(Banner.Mode.CONSOLE);
////		springApplication.setWebApplicationType(WebApplicationType.NONE);
//		springApplication.setAdditionalProfiles("prod");
//		springApplication.setHeadless(true);
//
//		new SpringApplicationBuilder(Application.class) .bannerMode(Banner.Mode.CONSOLE).profiles("prod") .headless(true) .run(args);
	}

}
