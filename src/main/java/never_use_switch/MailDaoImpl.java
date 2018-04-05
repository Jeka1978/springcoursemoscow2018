package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class MailDaoImpl implements MailDao {
    private DataFactory dataFactory = new DataFactory();
    @Override
    public int getMailCode() {
        return dataFactory.getNumberBetween(1,4);
    }
}
