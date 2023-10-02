package com.example.viber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.core.env.Environment;

import java.util.Objects;

@SpringBootApplication
public class ViberWebHookApplication implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	@Autowired
	private Environment env;
	public static void main(String[] args) {
		SpringApplication.run(ViberWebHookApplication.class, args);
	}

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		factory.setPort(Integer.parseInt(Objects.requireNonNull(env.getProperty("server.port"))));
	}
}
