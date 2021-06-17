package Pracownicy.src;

import java.util.Comparator;

public class ExperienceSorter implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.compareExperienceTo(e2);
    }

}
