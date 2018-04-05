package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("2")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        //50 lines of code
        return "happy birthday, buddy!!!";
    }
}
