package org.example.chiefs_arena.App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonneTest {
    @Test
    void testPersonneConstructorAndGetters() {
        Personne personne = new Personne(1, "Doe", "John", 25, "participant");
        assertEquals(1, personne.getId());
        assertEquals("Doe", personne.getNom());
        assertEquals("John", personne.getPrenom());
        assertEquals(25, personne.getAge());
        assertEquals("participant", personne.getRole());
    }

    @Test
    void testSetId() {
        Personne personne = new Personne(1, "Durand", "John", 25, "participant");
        personne.setId(2);
        assertEquals(2, personne.getId());
    }

    @Test
    void testSetNom() {
        Personne personne = new Personne(1, "Durand", "John", 25, "participant");
        personne.setNom("Smith");
        assertEquals("Smith", personne.getNom());
    }

    @Test
    void testSetPrenom() {
        Personne personne = new Personne(1, "Durand", "John", 25, "participant");
        personne.setPrenom("Jane");
        assertEquals("Jane", personne.getPrenom());
    }

    @Test
    void testSetAge() {
        Personne personne = new Personne(1, "Durand", "John", 25, "participant");
        personne.setAge(30);
        assertEquals(30, personne.getAge());
    }

    @Test
    void testSetRole() {
        Personne personne = new Personne(1, "Durand", "John", 25, "participant");
        personne.setRole("jury");
        assertEquals("jury", personne.getRole());
    }
}