package ComparableClass;

import java.util.Arrays;

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

        Arrays.sort(employee);
        printArr(employee);

    }

    static void printArr(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

class Employee implements Comparable<Employee> {
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

    @Override
    public int compareTo(Employee another) {
        // solution 1 ------------------------
//        return this.age - another.age;

        // solution 2 ------------------------ -> нужно поменять поля int на Integer
//        return this.iq.compareTo(another.iq);

        // solution 3 ------------------------
        if (this.age > another.age) {
            return 1;
        }
        if (this.age == another.age) {
            if (this.iq > another.iq) {
                return 1;
            }
            return -1;
        }
        return -1;

        // solution 4 ------------------------
//        int res = Integer.compare(this.getAge(), another.getAge());
//        if (res !=0){
//            return res;
//        }
//        return Integer.compare(this.getIq(), another.getIq());

    }
}

//    Самый чистый способ:
//
//        Arrays.sort(months, Comparator.comparingInt(String::length));
//        или со статическим импортом:
//
//        Arrays.sort(months, comparingInt(String::length));
//        Однако это тоже сработает, но более подробное:
//
//        Arrays.sort(months,
//        (String a, String b) -> a.length() - b.length());
//        Или короче:
//
//        Arrays.sort(months, (a, b) -> a.length() - b.length());
//        Наконец, ваш последний:
//
//        Arrays.sort(months,
//        (String a, String b) -> { return Integer.signum(a.length() - b.length()) };
//        );
//        имеет ; неуместен - он должен быть:
//
//        Arrays.sort(months,
//        (String a, String b) -> { return Integer.signum(a.length() - b.length()); }
//        );
