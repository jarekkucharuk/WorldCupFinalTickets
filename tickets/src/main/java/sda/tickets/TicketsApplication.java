package sda.tickets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"sda.tickets.repository"})
@SpringBootApplication
public class TicketsApplication {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(TicketsApplication.class, args);
    }
}
