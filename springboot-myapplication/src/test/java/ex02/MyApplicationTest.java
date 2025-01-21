package ex02;

import ex02.component.MyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MyApplicationTest { // @SpringBootConfiguration 붙은 얘를 찾아냄.

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testMyComponentNotNull() {
        MyComponent myComponent = applicationContext.getBean("MyComponent", MyComponent.class);
        assertNotNull(myComponent);
    }
}
