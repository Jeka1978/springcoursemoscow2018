package profiles;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import quoters.Quoter;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @Autowired
    private Dao dao;

    @Scheduled(fixedDelay = 1000)
    public void doWork(){
        dao.save();
    }
}
