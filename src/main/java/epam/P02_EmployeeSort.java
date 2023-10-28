package epam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P02_EmployeeSort {
    public static void main(String[] args) {
        Employee e1 = new Employee("A", 4);
        Employee e2 = new Employee("A", 1);
        Employee e3 = new Employee("C", 2);
        Employee e4 = new Employee("B", 3);

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        SortEmployee sortedEmployee = empList1 -> empList1
            .sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getId));

        System.out.println("Before Sort: " + empList);
        sortedEmployee.sort(empList);
        System.out.println("After Sort: " + empList);

    }
}

@FunctionalInterface
interface SortEmployee {
    void sort(List<Employee> empList);
}

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
    }
}
