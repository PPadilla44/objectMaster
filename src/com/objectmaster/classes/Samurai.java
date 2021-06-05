package com.objectmaster.classes;

import com.objectmaster.Human;

public class Samurai extends Human{

    private static int totalNumOfSamurais = 0;

    public Samurai(){
        health = 200;
        totalNumOfSamurais++;
    }

    public void deathBlow(Human human) {
        human.setHealth(0);
        this.health/=2;
    }

    public void meditate(){
        int healAmount = health/2;
        health += healAmount;
    }

    public static int howMany() {
        return totalNumOfSamurais;
    }

    @Override
    public String toString(){
        return "Samurai\n" + super.toString();
    }
}
