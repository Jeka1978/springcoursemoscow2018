package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile("PROD")
public class ProdDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving to prod");
    }
}
