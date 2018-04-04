package quoters;

import my.spring.TalkingMachine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean(TalkingMachine.class);
        context.getBean(TalkingMachine.class);
        context.getBean(TalkingMachine.class);
    }
}
