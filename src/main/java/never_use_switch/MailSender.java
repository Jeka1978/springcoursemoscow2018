package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailSender {
    private MailDao mailDao = new MailDaoImpl();

    public void sendMail() {
        int mailCode = mailDao.getMailCode();
        switch (mailCode) {
            case 1:
                //50 lines of code
                System.out.println("Welcome mail was sent");
                break;
            case 2:
                //60 lines of code
                System.out.println("Happy birthday mail was sent");
                break;
        }
    }
}
