package my.spring;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import quoters.Quoter;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TalkingMachineImpl implements TalkingMachine {
    @Setter
    private List<Quoter> quoters;


    public TalkingMachineImpl(int x, double y) {
        System.out.println("x = " + x);
    }

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
