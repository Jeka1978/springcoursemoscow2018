package quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "quoters")
@EnableAspectJAutoProxy
public class Conf {

}
