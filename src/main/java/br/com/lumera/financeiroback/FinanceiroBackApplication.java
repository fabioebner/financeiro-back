package br.com.lumera.financeiroback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;


@SpringBootApplication
public class FinanceiroBackApplication {
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		RestTemplate retorno = builder.build();
		return  retorno;
	}

	public static void main(String[] args) {
		SpringApplication.run(FinanceiroBackApplication.class, args);
	}
//	@Bean
//	public Module moneyModule(){
//		return new MoneyModule();
//	}
//
//	@Bean("customObjectMapper")
//	public ObjectMapper getCustomObjectMapper() {
//		ObjectMapper mapper = new ObjectMapper()
//				.registerModule(new MoneyModule().withQuotedDecimalNumbers());
//		return mapper;
//	}
}
