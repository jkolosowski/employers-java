package Pracownicy.tests;

import Pracownicy.src.*;
import org.junit.*;
import static org.junit.Assert.*;

public class RegisterTest {

    public Register register = new Register();

    @Test
    public void testRegisterDefaultEmpty(){
        assertEquals(0, register.getRegister().size());
    }

    @Test
    public void testRegisterAddEmployee() throws Exception {
        Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
        OfficeEmployee officeEmployee = new OfficeEmployee("111", "Jan", "Kowalski", 30, 20, address, "99", 105);
        register.addEmployee(officeEmployee);
        assertEquals(1, register.getRegister().size());
    }

    @Test
    public void testRegisterAddManyEmployees() throws Exception {
        Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
        OfficeEmployee officeEmployee = new OfficeEmployee("111", "Jan", "Kowalski", 30, 20, address, "99", 105);
        PhysicalEmployee physicalEmployee = new PhysicalEmployee("222", "Jan", "Kowalski", 30, 20, address, 50);
        register.addEmployees(officeEmployee, physicalEmployee);
        assertEquals(2, register.getRegister().size());
    }

    @Test
    public void testRemoveEmployeeFromRegister() throws Exception {
        Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
        OfficeEmployee officeEmployee = new OfficeEmployee("111", "Jan", "Kowalski", 30, 20, address, "99", 105);
        PhysicalEmployee physicalEmployee = new PhysicalEmployee("222", "Jan", "Kowalski", 30, 20, address, 50);
        register.addEmployees(officeEmployee, physicalEmployee);
        register.removeEmployee("111");
        assertEquals(1, register.getRegister().size());
        assertEquals("222", register.getRegister().get(0).id);
    }

    @Test
    public void testSortRegister() throws Exception {
        Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
        OfficeEmployee officeEmployee = new OfficeEmployee("111", "Jan", "Kowalski", 30, 10, address, "99", 105);
        PhysicalEmployee physicalEmployee = new PhysicalEmployee("222", "Jan", "Nowak", 45, 25, address, 50);
        TraderEmployee traderEmployee = new TraderEmployee("333", "Jan", "Brzuch", 35, 15, address, "NISKA", 35);
        register.addEmployees(officeEmployee, physicalEmployee, traderEmployee);
        register.sortRegister();
        assertEquals("222", register.getRegister().get(0).id);
        assertEquals("333", register.getRegister().get(1).id);
        assertEquals("111", register.getRegister().get(2).id);
    }

    @Test
    public void testGetEmployeesByCityRegister() throws Exception {
        Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
        OfficeEmployee officeEmployee = new OfficeEmployee("111", "Jan", "Kowalski", 30, 10, address, "99", 105);
        PhysicalEmployee physicalEmployee = new PhysicalEmployee("222", "Jan", "Nowak", 45, 25, address, 50);
        TraderEmployee traderEmployee = new TraderEmployee("333", "Jan", "Brzuch", 35, 15, address, "NISKA", 35);
        register.addEmployees(officeEmployee, physicalEmployee, traderEmployee);
        assertEquals(3, register.getEmployeesByCity("Gdańsk").size());
    }

    @Test (expected = Exception.class)
    public void testPrintRegisterException() throws Exception {
        register.printRegister();
    }

}
