package profiles;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile("DEV")
public class DevDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving to dev");
    }
}
