package com.objectmaster.classes;
import com.objectmaster.Human;

public class Ninja extends Human {

    public Ninja(){
        stealth = 10;
    }

    public void steal(Human human) {
        human.setHealth(human.getHealth()-this.stealth);
        this.health += this.stealth;
    }

    public void runAway() {
        health-=10;
    }

    @Override
    public String toString(){
        return "Ninja\n" + super.toString();
    }
}
