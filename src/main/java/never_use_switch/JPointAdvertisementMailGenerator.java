package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("2")
public class JPointAdvertisementMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        return "JPoint forever!!!";
    }
}
