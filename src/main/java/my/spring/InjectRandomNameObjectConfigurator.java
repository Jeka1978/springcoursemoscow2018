package my.spring;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomNameObjectConfigurator implements ObjectConfigurator {
    private DataFactory dataFactory = new DataFactory();
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                String name = dataFactory.getName();
                field.setAccessible(true);
                field.set(t,name);
            }
        }
    }
}
