package Comparator;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeApp {
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

        // --- без имплементации компоратора ---
//        Arrays.sort(employee, (a, b) -> Integer.compare(a.getAge(), b.getAge()));
//        Arrays.sort(employee, (a, b) -> a.getStatus().compareTo(b.getStatus()));
        // ---  ----- ----- ----- ----- ----- -

        Arrays.sort(employee, new IComparator());
        Arrays.sort(employee, new IComparatorStatus());
        Arrays.sort(employee, new IComparatorIq());
        Arrays.sort(employee, (a, b) -> {
            return Integer.compare(a.getAge(), b.getAge());
        });

        printArr(employee);

    }

    static void printArr(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

//class Employee implements Comparator <Employee> { - кампаратор релоадить в классе
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

class IComparator implements Comparator <Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        // solution 3 ------------------------
        if (o1.age > o2.age) {
            return 1;
        }
        if (o1.age == o2.age) {
            if (o1.iq > o2.iq) {
                return 1;
            }
            return -1;
        }
        return -1;
    }
}


// без импле
class IComparatorStatus implements Comparator <Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.status.compareTo(o2.status);
    }
}

class IComparatorIq implements Comparator <Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getIq() - o2.getIq();
    }
}

