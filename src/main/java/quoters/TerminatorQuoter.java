package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Media(Genre.BOOK)
@PropertySource("classpath:application.properties")
public class TerminatorQuoter implements Quoter {


    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String messages) {
        this.messages = Arrays.asList(messages.split(","));
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    public void killAll(){
        System.out.println("You are terminated");
    }
}
