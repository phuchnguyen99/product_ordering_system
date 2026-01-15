package com.phuchnguyen99.ordercontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.phuchnguyen99.orderdataaccess"})
@EntityScan(basePackages = {"com.phuchnguyen99.orderdataaccess.*"})
@ComponentScan(basePackages = {"com.phuchnguyen99.*", "com.phuchnguyen99.ordreapplication"})
@SpringBootApplication(scanBasePackages = "com.phuchnguyen99.*")
public class OrderContainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderContainerApplication.class, args);
    }

}
