package quoters.aop;

/**
 * @author Evgeny Borisov
 */
public class DBException extends RuntimeException {
    public DBException(String message) {
        super(message);
    }
}
