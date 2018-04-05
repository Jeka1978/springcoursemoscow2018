package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class JPointAdvertisementMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        return "JPoint forever!!!";
    }

    @Override
    public int mailCode() {
        return 3;
    }
}
