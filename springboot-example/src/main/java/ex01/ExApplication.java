package ex01;

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

    public static void main(String[] args) {
        /*
        ConfigurableApplicationContext ac = null;
        try {
            ac = SpringApplication.run(ExApplication.class, args);
            System.out.println("ExApplication runs... " + ac.getBean("myMap", Map.class).get("greetings"));
        } catch (Exception ignored) {
        } finally {
            ac.close();
        }
        */

        // 가장 정석인 springboot 코드
        try (ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)) {
            System.out.println("ExApplication runs... " + ac.getBean("myMap", Map.class).get("greetings"));
        }
    }
}
