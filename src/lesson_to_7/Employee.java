package lesson_to_7;

public class Employee {
    double salary;
    boolean inManager;

    Employee(double salary, boolean inManager){
        this.salary = salary;
        this.inManager = inManager;
    }
}

class Test{
    public static void main(String[] args) {
        Employee e = new Employee(30000, true);
        System.out.println("Is " + e.inManager + e.salary);

    }
}
