package Pracownicy.src;

public class printRegister {

    public static void main(String[] args) throws Exception {
        Register register = new Register();
        Address address = new Address("Wita Stwosza", "57", 1, "Gdańsk");
        OfficeEmployee officeEmployee = new OfficeEmployee("111", "Jan", "Kowalski", 30, 10, address, "99", 105);
        PhysicalEmployee physicalEmployee = new PhysicalEmployee("222", "Jan", "Nowak", 45, 25, address, 50);
        TraderEmployee traderEmployee = new TraderEmployee("333", "Jan", "Brzuch", 35, 15, address, "NISKA", 35);
        register.addEmployees(officeEmployee, physicalEmployee, traderEmployee);
        register.printRegister();
    }

}
