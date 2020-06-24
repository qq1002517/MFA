package com.github.ghthou.googleauthenticator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class GoogleAuthenticatorIntegrationApplication {

    public static void main(String[] args) {
        ConfigurableEnvironment env = SpringApplication
                .run(GoogleAuthenticatorIntegrationApplication.class, args).getEnvironment();
        String port = env.getProperty("server.port", "8080");
        System.out.println("项目信息 http://localhost:8080");
        System.out.println("二维码 http://localhost:8080/qr_code");

    }
}
