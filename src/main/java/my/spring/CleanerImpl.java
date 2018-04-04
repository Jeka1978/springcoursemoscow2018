package my.spring;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {

    @InjectRandomName
    private String name;

    public void clean() {
        System.out.println("cleaner по имени "+name);
        System.out.println("VVVVVVVVVVVVvvvvvvvvvvvv");
    }
}
