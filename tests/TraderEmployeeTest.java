package Pracownicy.tests;

import Pracownicy.src.Address;
import Pracownicy.src.TraderEmployee;

import org.junit.*;
import static org.junit.Assert.*;

public class TraderEmployeeTest {

    public Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
    public TraderEmployee traderEmployee = new TraderEmployee("333", "Jan", "Kowalski", 30, 20, address, "NISKA", 35);

    public TraderEmployeeTest() throws Exception {
    }

    @Test
    public void testEfficiencyTraderEmployeeInitialise(){
        assertEquals(60, traderEmployee.efficiency);
    }

    @Test
    public void testCommissionRateTraderEmployeeInitialise(){
        assertEquals(35, traderEmployee.commissionRate);
    }

    @Test
    public void testValueIsCountedProperlyTraderEmployee(){
        assertEquals(1200, traderEmployee.value);
    }

    @Test
    public void testEfficiencyChangeCorrectly() throws Exception {
        TraderEmployee trader1 = new TraderEmployee("334", "Jan", "Kowalski", 30, 20, address, "ŚREDNIA", 35);
        TraderEmployee trader2 =  new TraderEmployee("335", "Jan", "Kowalski", 30, 20, address, "WYSOKA", 35);
        assertEquals(90, trader1.efficiency);
        assertEquals(120, trader2.efficiency);
    }

    @Test (expected = Exception.class)
    public void testEfficiencyWrongInitialise() throws Exception {
        new TraderEmployee("336", "Jan", "Kowalski", 30, 20, address, "MAKSYMALNA", 35);
    }

}
