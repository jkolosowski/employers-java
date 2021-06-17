package Pracownicy.src;

public class Employee {

    public String id;
    public String name;
    public String surname;
    public int age;
    public int experience;
    public Address address;
    public int value;

    public Employee(String id, String name, String surname, int age, int experience, Address address){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
        this.address = address;
    }

    public int compareExperienceTo(Employee e){
        if (this.experience > e.experience) return -1;
        else if (e.experience > this.experience) return 1;
        return 0;
    }

    public int compareAgeTo(Employee e){
        if (this.age > e.age) return 1;
        else if (e.age > this.age) return -1;
        return 0;
    }

}
