package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	// 메시지 및 국제화 기능 (스프링 부트에서 자동으로 지원하기 때문에 따로 코드를 작성하지 않아도 됨)
	// @Bean
	// public MessageSource messageSource() {
	// 	ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	// 	messageSource.setBasenames("messages", "errors");
	// 	messageSource.setDefaultEncoding("utf-8");
	// 	return messageSource;
	// }

}
