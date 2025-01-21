package ex01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class MyApplicationTest { // @SpringBootConfiguration 붙은 얘를 찾아냄.

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testMyComponent01NotNull() {
        MyComponent myComponent = applicationContext.getBean("MyComponent01", MyComponent.class);
        assertNotNull(myComponent);
    }

    @Test
    public void testMyComponent02Null() {
        // @SpringBootTest 에서는 @Configuration 을 달고 있는 설정 클래스는 찾지 못한다.

        // MyComponent myComponent = applicationContext.getBean("MyComponent02", MyComponent.class);
        // assertNotNull(myComponent); // 테스트 실패. getBean은 해당되는 Component가 없으면 Exception을 터뜨림.

        assertThrows(NoSuchBeanDefinitionException.class, () -> {
            applicationContext.getBean("MyComponent02", MyComponent.class);
        });
    }
}
