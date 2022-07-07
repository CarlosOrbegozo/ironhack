package com.ironhack.classes.cat;

import com.ironhack.classes.pet.Pet;

public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeAnAdorableSound() {
        System.out.println("MEOW");
    }
}
