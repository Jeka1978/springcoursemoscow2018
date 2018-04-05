package never_use_switch;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Component
public class MailSender {

    private final MailDao mailDao;


    @Autowired
    private Map<String,MailGenerator> map;

    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        String mailCode = String.valueOf(mailDao.getMailCode());
        MailGenerator mailGenerator = map.getOrDefault(mailCode, () -> {
            throw new RuntimeException(mailCode + " not supported");
        });
        String html = mailGenerator.generateBody();
        send(html);
    }

    private void send(String html) {
        System.out.println(html+" was sent");
    }
}










