package com.vwits.todo.WebConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfigurationFile implements WebMvcConfigurer {


	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOriginPatterns("*").
				allowedOrigins("http://localhost:4200").allowedMethods("*")
				.allowedHeaders("*").allowCredentials(true);
	}

}
