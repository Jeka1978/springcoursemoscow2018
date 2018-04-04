package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MailSender mailSender = new MailSender();

        while (true) {
            mailSender.sendMail();
            Thread.sleep(1000);
        }
    }
}
