package never_use_switch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        new AnnotationConfigApplicationContext(MailConf.class);
    }
}
