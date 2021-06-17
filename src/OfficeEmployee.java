package Pracownicy.src;

public class OfficeEmployee extends Employee{

    public String officePosition;
    public int intellect;

    public OfficeEmployee(String id, String name, String surname, int age, int experience, Address address, String officePosition, int intellect) throws Exception {
        super(id, name, surname, age, experience, address);
        this.officePosition = officePosition;
        if (intellect <= 150 && intellect >= 70){
            this.intellect = intellect;
        } else {
            throw new Exception("IQ only 70-150");
        }
        this.value = this.experience * this.intellect;
    }

}
