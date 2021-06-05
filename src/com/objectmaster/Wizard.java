package com.objectmaster;


public class Wizard extends Human {

    public Wizard(){
        health = 50;
        intelligence = 8;
    }

    public void heal(Human human){
        human.health += this.intelligence;
    }

    public void fireball(Human human) {
        int damage = this.intelligence * 3;
        human.health -= damage;
    }

    @Override
    public String toString(){
        return "Wizard\n" + super.toString();
    }
}
