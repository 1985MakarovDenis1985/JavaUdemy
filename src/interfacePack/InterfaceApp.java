package interfacePack;

import Str.Str;

public class InterfaceApp {

}

class Employee {
    double salary = 100;
    String name = "Denys";
    int age;
    int experience;

    void eat() {

    }

    void sleep() {

    }

}

class Teacher extends Employee implements Help {
    int countStudents;
    void teach() { }
    @Override
    public void help() {
        System.out.println("teacher help");
    }
    @Override
    public void firefighter() {
        System.out.println("teacher fight with fire");
    }
}

class Driver extends Employee implements swimAble, Help {
    String car;
    void drive() { }
    @Override
    public void swim() {
        System.out.println("driver swim");
    }

    @Override
    public void help() {
        System.out.println("driver help");
    }

    @Override
    public void firefighter() {
        System.out.println("driver firefighter");
    }
}

interface Help {
    void help();
    void firefighter();
}

interface swimAble {
    void swim();
}