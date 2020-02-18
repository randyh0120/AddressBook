package AddressBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void getPersons() {
        AddressBook getPersonTest = new AddressBook();

        Person[] personResult = getPersonTest.getPersons();
        // Work on This
        //assertEquals(1, personResult);
    }

    @Test
    void add() {
        AddressBook addTest = new AddressBook();

        Person person = new Person("Randy", "Hattab", "Street address", "Fort Myers", "FL", "ZipCode", "Phone #");
        addTest.add(person);
        assertEquals(person, person);
    }

    @Test
    void set() {
        AddressBook setTest = new AddressBook();
    }

    @Test
    void remove() {
        AddressBook removeTest = new AddressBook();
    }

    @Test
    void get() {
        AddressBook getTest = new AddressBook();
    }

    @Test
    void clear() {
        AddressBook clearTest = new AddressBook();
    }

    @Test
    void getRowCount() {
    }

    @Test
    void getColumnCount() {
    }

    @Test
    void getValueAt() {
    }

    @Test
    void getColumnName() {
    }

}