package Pracownicy.src;

import java.util.Comparator;

public class SurnameSorter implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.surname.compareTo(e2.surname);
    }

}
