package com.ifruitcommerce.ifruit.config;

import com.ifruitcommerce.ifruit.entities.User;
import com.ifruitcommerce.ifruit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("teste")

public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
       User u1 = new User(null,"Mateus", "mateusaugusto@gmaol.com", "43999999", "1234567");
       User u2 = new User(null,"Jubileu", "jubileu@gmaol.com", "439956799", "15656567");

       userRepository.saveAll(Arrays.asList(u1, u2));
    }


}
