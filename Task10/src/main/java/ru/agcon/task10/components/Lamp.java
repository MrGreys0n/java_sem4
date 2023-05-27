package ru.agcon.task10.components;

import org.springframework.stereotype.Component;
import ru.agcon.task10.interfaces.Lighter;

@Component
public class Lamp implements Lighter {
    @Override
    public void doLight() {
        System.out.println("Light from Lamp");
    }
}
