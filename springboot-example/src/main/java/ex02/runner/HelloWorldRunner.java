package ex02.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.Map;

public class HelloWorldRunner implements ApplicationRunner {
    // ApplicationRunner는 Spring Boot에서 애플리케이션이 실행된 후 특정 로직을 실행하도록 설계된 인터페이스

    private Map<?, ?> map;

    public HelloWorldRunner(Map<?, ?> map) {
        this.map = map;
    }

    // ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아서 실행 - ex02.ExApplication
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ExApplication runs... " + map.get("greetings"));
    }
}
