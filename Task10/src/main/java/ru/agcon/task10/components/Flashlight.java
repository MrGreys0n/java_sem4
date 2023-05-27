package ru.agcon.task10.components;

import org.springframework.stereotype.Component;
import ru.agcon.task10.interfaces.Lighter;

@Component
public class Flashlight implements Lighter {
    @Override
    public void doLight() {
        System.out.println("Light from Lighter");
    }
}
