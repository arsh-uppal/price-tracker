package com.ars.sra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ars.sra.model.ProductDetailPojo;
import com.ars.sra.model.TrackUrlModel;

@Configuration
@EnableWebMvc
@ComponentScan("com.ars.sra.*")
public class WebConfig {
	
	@Bean
	TrackUrlModel trackUrlModel() {
		return new TrackUrlModel();
	}
	@Bean
	ProductDetailPojo productDetailPojo() {
		return new ProductDetailPojo();
	}
}
