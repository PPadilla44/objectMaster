package com.objectmaster.classes;

import com.objectmaster.Human;

public class Wizard extends Human {

    public Wizard(){
        health = 50;
        intelligence = 8;
    }

    public void heal(Human human){
        human.setHealth(human.getHealth()+this.intelligence);
    }

    public void fireball(Human human) {
        int damage = this.intelligence * 3;
        human.setHealth(human.getHealth()-damage);
    }

    @Override
    public String toString(){
        return "Wizard\n" + super.toString();
    }
}
