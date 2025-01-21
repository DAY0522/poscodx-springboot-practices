package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration // 테스트를 위해 @SpringBootApplication이 아닌 Configuration 사용
public class MyApplication01 {

    @Bean("MyComponent01")
    public MyComponent myComponent(){
        return new MyComponent();
    }

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication01.class, args)) { // ApplicationRunner 빈의 run() 메서드를 실행
        }
    }
}
