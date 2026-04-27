package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testValidContact() {
        Contact c = new Contact("12345", "Liz", "Wing", "1234567890", "123 Street");

        assertEquals("12345", c.getContactId());
        assertEquals("Liz", c.getFirstName());
        assertEquals("Wing", c.getLastName());
        assertEquals("1234567890", c.getPhone());
        assertEquals("123 Street", c.getAddress());
    }

    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Liz", "Wing", "1234567890", "123 Street");
        });
    }

    @Test
    public void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Liz", "Wing", "123", "123 Street");
        });
    }
}