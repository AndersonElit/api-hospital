package com.apihospital;

import io.swagger.v3.oas.models.annotations.OpenAPI30;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPI30
public class ApiHospitalApp {

    public static void main(String[] args) {
        SpringApplication.run(ApiHospitalApp.class, args);
    }

}
