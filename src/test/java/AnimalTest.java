import org.example.domain.Animal;
import org.example.domain.Chat;
import org.example.domain.Chien;
import org.example.service.AnimalService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AnimalTest {

    @Test
    void chienImplementeAnimal() {
        Animal chien = new Chien();
        assertNotNull(chien);
        chien.manger();
        chien.parler();
        chien.dormir();
    }

    @Test
    void chatImplementeAnimal() {
        Animal chat = new Chat();
        assertNotNull(chat);
        chat.manger();
        chat.parler();
        chat.dormir();
    }

    @Test
    void serviceRoutineFonctionne() {
        AnimalService service = new AnimalService();
        assertDoesNotThrow(() -> service.routine(new Chien()));
        assertDoesNotThrow(() -> service.routine(new Chat()));
    }
}