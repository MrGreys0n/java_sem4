package ru.agcon.task10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.agcon.task10.components.Firefly;
import ru.agcon.task10.components.Flashlight;
import ru.agcon.task10.components.Lamp;
import ru.agcon.task10.interfaces.Lighter;

@Configuration
public class BeanConfig {

    @Bean(name = "Firefly")
    public Lighter Firefly() {
        return new Firefly();
    }

    @Bean(name = "Flashlight")
    public Lighter Flashlight (){
        return new Flashlight();
    }

    @Bean(name = "Lamp")
    public Lighter Lamp(){
        return new Lamp();
    }
}