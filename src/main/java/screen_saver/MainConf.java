package screen_saver;

import lombok.SneakyThrows;
import org.springframework.context.annotation.*;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
//@ImportResource("classpath:applicationContext.xml")
public class MainConf {
    private Random random = new Random();

    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color(){
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame colorFrame() {
        ColorFrame colorFrame = new ColorFrame();
        colorFrame.setColor(color());
        return colorFrame;
    }



    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        while (true) {
            context.getBean(ColorFrame.class).fly();
            Thread.sleep(50);
        }
    }
}












