package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        return "<html>welcome new client</html>";
    }

    @Override
    public int mailCode() {
        return 1;
    }
}
