package Pracownicy.src;

public class PhysicalEmployee extends Employee{

    public int strength;

    public PhysicalEmployee(String id, String name, String surname, int age, int experience, Address address, int strength) throws Exception {
        super(id, name, surname, age, experience, address);
        if (strength >= 1 && strength <= 100) {
            this.strength = strength;
        } else {
            throw new Exception("Strength only 1-100");
        }
        this.value = (this.experience * this.strength) / this.age;
    }
    
}
