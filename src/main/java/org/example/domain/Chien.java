package org.example.domain;

public class Chien implements Animal {
    @Override
    public void manger() {
        System.out.println("Le chien mange des croquettes.");
    }

    @Override
    public void dormir() {
        System.out.println("Le chien dort dans sa niche.");
    }

    @Override
    public void parler() {
        System.out.println("Wouf Wouf !");
    }
}
