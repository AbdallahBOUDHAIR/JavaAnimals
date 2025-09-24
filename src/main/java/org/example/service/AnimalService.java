package org.example.service;


import org.example.domain.Animal;

public class AnimalService {

    // Méthode qui exécute la routine complète d’un animal
    public void routine(Animal animal) {
        System.out.println("=== Routine de l’animal ===");
        animal.manger();
        animal.parler();
        animal.dormir();
        System.out.println("===========================");
    }
}
