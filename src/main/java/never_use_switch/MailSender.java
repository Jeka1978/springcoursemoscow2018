package never_use_switch;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
@Component
public class MailSender {

    private final MailDao mailDao;


    private final Map<Integer, MailGenerator> map;

    public MailSender(List<MailGenerator> list, MailDao mailDao) {
        this.mailDao = mailDao;
        map = list.stream().collect(Collectors.toMap(MailGenerator::mailCode, Function.identity()));

    }

    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        int mailCode = mailDao.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new RuntimeException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generateBody();
        send(html);
    }

    private void send(String html) {
        System.out.println(html + " was sent");
    }
}










