package Pracownicy.tests;

import Pracownicy.src.Address;
import Pracownicy.src.OfficeEmployee;

import org.junit.*;
import static org.junit.Assert.*;

public class OfficeEmployeeTest {

    public Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
    public OfficeEmployee officeEmployee = new OfficeEmployee("111", "Jan", "Kowalski", 30, 20, address, "99", 105);

    public OfficeEmployeeTest() throws Exception {
    }

    @Test
    public void testOfficePositionOfficeEmployeeInitialise(){
        assertEquals("99", officeEmployee.officePosition);
    }

    @Test
    public void testIntellectOfficeEmployeeInitialise(){
        assertEquals(105, officeEmployee.intellect);
    }

    @Test
    public void testValueIsCountedProperlyOfficeEmployee(){
        assertEquals(2100, officeEmployee.value);
    }

    @Test (expected = Exception.class)
    public void testIntellectTooLargeOfficeEmployeeInitialise() throws Exception {
        new OfficeEmployee("111", "Jan", "Kowalski", 30, 20, address, "99", 151);
    }

    @Test (expected = Exception.class)
    public void testIntellectTooSmallOfficeEmployeeInitialise() throws Exception{
        new OfficeEmployee("111", "Jan", "Kowalski", 30, 20, address, "99", 69);
    }

}
