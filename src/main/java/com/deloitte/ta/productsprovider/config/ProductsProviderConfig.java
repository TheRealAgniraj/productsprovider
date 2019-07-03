package com.deloitte.ta.productsprovider.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class ProductsProviderConfig {

	@Bean
	public Docket smartBuyApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.deloitte.ta.productsprovider.controller")).build()
				.apiInfo(metaData());
	}

	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("Products Provider API", "This API acts as a repository of products", "1.0", "Terms of service",
				new Contact("Agniraj", "https://in.linkedin.com/in/agniraj", "iamagniraj@gmail.com"),
				"Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
		return apiInfo;
	}
}
