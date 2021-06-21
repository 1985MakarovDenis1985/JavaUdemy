package lesson_7;

// modifiers во внешних классах доступен только public либо default
// так же есть privet и protected
public class Employee {
    public double salary;

    public Employee(double salary2){
        salary = salary2;
    }

    public void doubleSalary(){
        System.out.println("new salary = " + salary * 2);
    }

    public static void main(String[] args) {
        Employee sal = new Employee(33000);
        sal.doubleSalary();
        System.out.println(sal.salary);
    }


}
