package my.spring;

/**
 * @author Evgeny Borisov
 */

public final class CleanerImpl implements Cleaner {

    @InjectRandomName
    private String name;

    @Benchmark
    public void clean() {
        System.out.println("cleaner по имени "+name);
        System.out.println("VVVVVVVVVVVVvvvvvvvvvvvv");
    }
}
