import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Alice", "12345"));
        assertEquals(2, phoneBook.add("Bob", "54321"));
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        assertEquals("Alice", phoneBook.findByNumber("12345"));
        assertNull(phoneBook.findByNumber("11111"));
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        assertEquals("12345", phoneBook.findByName("Alice"));
        assertNull(phoneBook.findByName("Eve"));
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Charlie", "55555");
        phoneBook.add("Alice", "12345");
        phoneBook.add("Bob", "23456");
        assertArrayEquals(new String[]{"Alice", "Bob", "Charlie"}, phoneBook.printAllNames());
    }
}
