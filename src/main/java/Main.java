import blackJack.Blackjack;
import blackJack.Deck;
import blackJack.Player;
import config.AppConfig;
import item.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/context-common.xml");
//                                      generic 확인
//        UserService service = context.getBean("userService", UserService.class);
//        service.insert();

//        Player user = context.getBean("blackJackUser", Player.class);
//        Player dealer = context.getBean("blackJackDealer", Player.class);

        Blackjack game = context.getBean("blackJackGame", Blackjack.class);
        game.play();


    }
}
