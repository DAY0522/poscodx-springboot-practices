package ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan // 적용된 설정 클래스의 패키지를 포함, 하부 패키지의 @Component, @Service 그리고 @Controller가 달려 있는 클래스들을 스캔하여 빈 생성 및 등록 작업을 한다.
public class MyApplication {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)) { // ApplicationRunner 빈의 run() 메서드를 실행
        }
    }
}
