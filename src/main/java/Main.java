import config.AppConfig;
import item.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = new AnnotationConfigApplicationContext("classpath:config/context-common.xml");

        UserService service = context.getBean("userService", UserService.class);

        service.insert();

    }
}
