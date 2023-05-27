package ru.agcon.task10.components;

import org.springframework.stereotype.Component;
import ru.agcon.task10.interfaces.Lighter;

@Component
public class Kostya {
    private Lighter lighter;

    public Kostya(Lighter lighter) {
        this.lighter = lighter;
    }

    public void doLight(){
        System.out.println("I'm Lighter");
    }
}

