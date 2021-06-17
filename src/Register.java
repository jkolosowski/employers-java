package Pracownicy.src;

import java.util.ArrayList;
import java.util.Arrays;

public class Register {

    public ArrayList<Employee> register = new ArrayList<>();

    public ArrayList<Employee> getRegister(){
        return register;
    }

    public void addEmployee(Employee employee){
        register.add(employee);
    }

    public void addEmployees(Employee... employees){
        register.addAll(Arrays.asList(employees));
    }

    public void removeEmployee(String id){
        register.removeIf(employee -> employee.id.equals(id));
    }

    public void sortRegister(){
        register.sort(new ExperienceSorter()
                .thenComparing(new AgeSorter()
                        .thenComparing(new SurnameSorter())));
    }

    public ArrayList<Employee> getEmployeesByCity(String city){
        ArrayList<Employee> employeesFromCity = new ArrayList<>();
        for (Employee employee : register){
            if (employee.address.city.equals(city)){
                employeesFromCity.add(employee);
            }
        }
        return employeesFromCity;
    }

    public void printRegister() throws Exception {
        if (register.size() > 0){
            for (Employee employee : register){
                System.out.println("Employee: " + employee.id + " " + employee.name + " " + employee.surname + " | "
                        + employee.age + " y.o | " + employee.experience + " y. experience | " + employee.value + " value | "
                        + "Address: " + employee.address.city + " " + employee.address.street + " " + employee.address.building
                        + "/" + employee.address.apartment + " | ");
            }
        } else {
            throw new Exception("The register is empty!");
        }

    }

}
