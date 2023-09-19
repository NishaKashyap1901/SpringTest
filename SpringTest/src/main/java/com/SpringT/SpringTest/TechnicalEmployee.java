package com.SpringT.SpringTest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class TechnicalEmployee implements Office {

public void punch()
    {
        System.out.println("can do 10.30 to 11");
    }
    public void system()
    {
        System.out.println("USes office's system");
    }
    public void lunch()
    {
        System.out.println("Eat in cafetaria");
    }
    public void play()
    {
        System.out.println("play when work get completed");
    }
}
