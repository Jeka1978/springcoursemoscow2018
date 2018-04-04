package my.spring;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private Reflections scanner = new Reflections("my.spring");

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }


    public <T> T createObject(Class<T> type) throws IllegalAccessException, InstantiationException {
        if (type.isInterface()) {
            Class<T> implClass = config.getImplClass(type);
            if (implClass == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new RuntimeException("0 or more than one impl found for " + type + " update your config");
                }
                type = (Class<T>) classes.iterator().next();
            }
            else {
                type = implClass;
            }
        }
        T t = type.newInstance();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                DataFactory dataFactory = new DataFactory();
                String name = dataFactory.getName();
                field.setAccessible(true);
                field.set(t,name);
            }
        }
        return t;

    }





}
