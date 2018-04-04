package quoters;

import lombok.Setter;
import my.spring.InjectRandomName;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static quoters.Genre.BOOK;

/**
 * @author Evgeny Borisov
 */
@Media(BOOK)
public class ShakespearQuoter implements Quoter {

    @Value("${shake}")
    @Setter
    private String message;

    @InjectRandomInt(min=3,max=6)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
