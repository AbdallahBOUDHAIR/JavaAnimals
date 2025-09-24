package org.example.app;


import org.example.domain.Chat;
import org.example.domain.Chien;
import org.example.service.AnimalService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnimalService service = new AnimalService();

        // Utilisation avec un chien
        service.routine(new Chien());

        System.out.println("-------------------------");

        // Utilisation avec un chat
        service.routine(new Chat());
    }
}