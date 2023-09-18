package com.admin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class VaultClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultClientApplication.class, args);
	}

}
