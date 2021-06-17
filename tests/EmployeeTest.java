package Pracownicy.tests;

import Pracownicy.src.Address;
import Pracownicy.src.Employee;

import org.junit.*;
import static org.junit.Assert.*;

public class EmployeeTest {

    public Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
    public Employee employee = new Employee("1234", "Jakub", "Kołosowski", 21, 2, address);

    @Test
    public void testIdInitialise(){
        assertEquals("1234", employee.id);
    }

    @Test
    public void testNameInitialise(){
        assertEquals("Jakub", employee.name);
    }

    @Test
    public void testSurnameInitialise(){
        assertEquals("Kołosowski", employee.surname);
    }

    @Test
    public void testAgeInitialise(){
        assertEquals(21, employee.age);
    }

    @Test
    public void testExperienceInitialise(){
        assertEquals(2, employee.experience);
    }

    @Test
    public void testAddressAdded(){
        assertEquals(address, employee.address);
    }

}
