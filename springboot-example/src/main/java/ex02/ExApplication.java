package ex02;

import ex02.runner.HelloWorldRunner;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@SpringBootApplication
public class ExApplication { // Bootstrap Class

    @Bean
    public Map<?, ?> myMap() {
        return Map.of("greetings", "Hello World");
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return new HelloWorldRunner(myMap());
    }

    public static void main(String[] args) {
        // 가장 정석인 springboot 코드

    }
}
