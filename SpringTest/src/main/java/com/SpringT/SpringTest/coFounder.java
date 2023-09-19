package com.SpringT.SpringTest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier
public class coFounder implements Office{

    public void punch(){
        System.out.println("Can Punch Any Time");
    }
    public void system()
    {
        System.out.println("uses their own system whith high facility");
    }
    public void lunch()
    {
        System.out.println("Eats in Titan cabin");
    }
    public void play()
    {
        System.out.println("play very less");
    }
}
