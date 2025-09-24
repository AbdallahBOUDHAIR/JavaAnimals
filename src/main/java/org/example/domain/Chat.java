package org.example.domain;

public class Chat implements Animal {
    @Override
    public void manger() {
        System.out.println("Le chat mange du poisson.");
    }

    @Override
    public void dormir() {
        System.out.println("Le chat dort sur le canapé.");
    }

    @Override
    public void parler() {
        System.out.println("Miaou !");
    }
}