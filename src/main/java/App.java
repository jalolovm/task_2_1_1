import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean("helloWorld",HelloWorld.class);
        System.out.println(bean.getMessage());
        HelloWorld bean1 = applicationContext.getBean("helloWorld",HelloWorld.class);

        Cat cat1 = applicationContext.getBean("cat",Cat.class);
        Cat cat2 = applicationContext.getBean("cat",Cat.class);

        System.out.println("helloWorlds: " + (bean == bean1));
        System.out.println("cats: " + (cat1 == cat2));
    }
}