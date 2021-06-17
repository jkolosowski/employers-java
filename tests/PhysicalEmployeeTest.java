package Pracownicy.tests;

import Pracownicy.src.Address;
import Pracownicy.src.PhysicalEmployee;

import org.junit.*;
import static org.junit.Assert.*;

public class PhysicalEmployeeTest {

    public Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
    public PhysicalEmployee physicalEmployee = new PhysicalEmployee("222", "Jan", "Kowalski", 30, 20, address, 50);

    public PhysicalEmployeeTest() throws Exception {
    }

    @Test
    public void testStrengthPhysicalEmployeeInitialise(){
        assertEquals(50, physicalEmployee.strength);
    }

    @Test
    public void testValueIsCountedProperlyPhysicalEmployee(){
        assertEquals(33, physicalEmployee.value);
    }

    @Test (expected = Exception.class)
    public void testStrengthTooLargePhysicalEmployeeInitialise() throws Exception{
        new PhysicalEmployee("223", "Jan", "Kowalski", 30, 20, address, 101);
    }

    @Test (expected = Exception.class)
    public void testStrengthTooSmallPhysicalEmployeeInitialise() throws Exception{
        new PhysicalEmployee("224", "Jan", "Kowalski", 30, 20, address, 0);
    }

}
