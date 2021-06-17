package Pracownicy.src;

public class TraderEmployee extends Employee{

    public int efficiency;
    public int commissionRate;

    public TraderEmployee(String id, String name, String surname, int age, int experience, Address address, String efficiency, int commissionRate) throws Exception {
        super(id, name, surname, age, experience, address);
        this.commissionRate = commissionRate;
        switch (efficiency) {
            case "NISKA" -> this.efficiency = 60;
            case "ŚREDNIA" -> this.efficiency = 90;
            case "WYSOKA" -> this.efficiency = 120;
            default -> throw new Exception("Efficiency only NISKA, WYSOKA or ŚREDNIA");
        }
        this.value = this.experience * this.efficiency;
    }

}
