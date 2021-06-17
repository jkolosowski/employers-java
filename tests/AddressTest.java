package Pracownicy.tests;

import Pracownicy.src.Address;

import org.junit.*;
import static org.junit.Assert.*;

public class AddressTest {

    public Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");

    @Test
    public void testStreetInitialise(){
        assertEquals("Wita Stwosza", address.street);
    }

    @Test
    public void testBuildingInitialise(){
        assertEquals("57", address.building);
    }

    @Test
    public void testApartmentInitialise(){
        assertEquals(1, address.apartment);
    }

    @Test
    public void testCityInitialise(){
        assertEquals("Gdańsk", address.city);
    }

}
