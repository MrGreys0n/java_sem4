package ru.agcon.task10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.agcon.task10.config.BeanConfig;
import ru.agcon.task10.interfaces.Lighter;

import java.io.IOException;

@SpringBootApplication
public class Task10Application {

    /*
    public static void main(String[] args) throws IOException {
        ApplicationContext context = SpringApplication.run(Task10Application.class, args);

        try {
            Lighter lighter = context.getBean(args[0], Lighter.class);
            lighter.doLight();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.err.println("Expected 1 command line argument, found 0!");
        }

    }

     */


     public static void main(String[] args) {
         ApplicationContext context =  new AnnotationConfigApplicationContext(BeanConfig.class);

         String beanName = args[0];
         Lighter lighter = (Lighter) context.getBean(beanName);
         lighter.doLight();
 }


}
