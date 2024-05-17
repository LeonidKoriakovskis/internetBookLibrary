package com.spring.internetBookLibrary.config;

import com.spring.internetBookLibrary.InternetBookLibraryApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InternetBookLibraryApplication.class);
	}

}
