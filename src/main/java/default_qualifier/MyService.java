package default_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class MyService {

    private Handler smallHandler;

    public MyService(Handler smallHandler) {
        this.smallHandler = smallHandler;
    }
}
