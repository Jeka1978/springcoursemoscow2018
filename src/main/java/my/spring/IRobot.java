package my.spring;

import lombok.ToString;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@ToString
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @InjectRandomName
    private String robotName;

    @PostConstruct
    public void init() {
        System.out.println(robotName);
        System.out.println(speaker.getClass().getName());
    }

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
