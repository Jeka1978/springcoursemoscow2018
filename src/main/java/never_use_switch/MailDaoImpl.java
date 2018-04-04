package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * @author Evgeny Borisov
 */
public class MailDaoImpl implements MailDao {
    private DataFactory dataFactory = new DataFactory();
    @Override
    public int getMailCode() {
        return dataFactory.getNumberBetween(1,3);
    }
}
