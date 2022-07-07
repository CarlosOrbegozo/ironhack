package com.ironhack.classes.dog;

import com.ironhack.classes.pet.Pet;

public class Dog implements Pet {
    private String name;

    public Dog(String name) {
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
        System.out.println("GUAU");
    }
}
