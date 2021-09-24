package IComporator;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Employee[] employee = {
                new Employee(31, 78, "programmer"),
                new Employee(37, 91, "programmer"),
                new Employee(41, 95, "boss"),
                new Employee(25, 87, "programmer"),
                new Employee(25, 85, "boss"),
                new Employee(37, 90, "boss"),
                new Employee(25, 83, "boss"),
        };

        Arrays.sort(employee, new IComparator());

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
}

class Employee  {
    int age;
    int iq;
    String status;

    public Employee(int age, int iq, String status) {
        this.age = age;
        this.iq = iq;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee : " +
                "age=" + age +
                ", iq=" + iq +
                ", status='" + status;
    }

    public int getAge() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    public String getStatus() {
        return status;
    }
}

class IComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.age > o2.age) return 1;

        if (o1.age == o2.age){
            if (o1.iq > o2.iq) return 1;
        }
        else {
            return -1;
        }
        return -1;
    }
}
