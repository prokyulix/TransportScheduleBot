package com.prokyulix.bots.transport;

import com.prokyulix.bots.transport.utils.DatabaseInitializator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableJpaRepositories
public class TransportScheduleCoreApplication {

    @Autowired
    private DatabaseInitializator databaseInitializator;

    @PostConstruct
    public void init() {
        this.databaseInitializator.initializeDatabase();
    }

    public static void main(String[] args) {
        SpringApplication.run(TransportScheduleCoreApplication.class, args);
    }
}
