package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("12345", "Liz", "Wing", "1234567890", "123 Street");

        service.addContact(c);

        service.updateFirstName("12345", "Beth");
        assertEquals("Beth", c.getFirstName());
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("12345", "Liz", "Wing", "1234567890", "123 Street");

        service.addContact(c);
        service.deleteContact("12345");

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("12345", "Test");
        });
    }

    @Test
    public void testDuplicateId() {
        ContactService service = new ContactService();

        Contact c1 = new Contact("12345", "Liz", "Wing", "1234567890", "123 Street");
        Contact c2 = new Contact("12345", "Amy", "Smith", "0987654321", "456 Road");

        service.addContact(c1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(c2);
        });
    }
}