import homework.Phonebook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    Phonebook phonebook;

    @BeforeEach
    public void setUp(){
        phonebook = new Phonebook();
    }

@Test
void createPhoneBookWithoutParameters(){
    //given
    Phonebook phonebook = new Phonebook();

    //when

    //then
    assertInstanceOf(HashMap.class, phonebook.getMap());
}

@Test
    void addAllTest() {
    // Given: A PhoneBook with a contact
    phonebook.add("Bob", "111-222-3333");

    // When: Removing the contact
    phonebook.remove("Bob");

    // Then: Verify the contact is removed
    assertTrue(phonebook.lookup("Bob").isEmpty());
}

@Test
    void testRemove() {
        // Given: A PhoneBook with a contact
        phonebook.add("Bob", "111-222-3333");

        // When: Removing the contact
        phonebook.remove("Bob");

        // Then: Verify the contact is removed
        assertTrue(phonebook.lookup("Bob").isEmpty());
    }

    @Test
    void testReverseLookup() {
        // Given: A PhoneBook with a contact and phone number
        phonebook.add("Charlie", "555-555-5555");

        // When: Performing a reverse lookup
        String name = phonebook.reverseLookup("555-555-5555");

        // Then: Verify the correct name is returned
        assertEquals("Charlie", name);

        // Given: A PhoneBook with a non-existent phone number
        // When: Performing a reverse lookup
        String nonExistentName = phonebook.reverseLookup("999-999-9999");

        // Then: Verify null is returned
        assertNull(nonExistentName);
    }
}

