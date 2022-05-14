package ru.skypro;

public class Employee {
    String fullName;
    int salary;
    int department;
    static int counter;
    int id;
    int u;

    public Employee(String fullName, int salary, int department){
        this.id = counter++;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    private String getFullName() {
        return fullName;
    }

    private int getDepartment() {
        return department;
    }

    private int getSalary() {
        return salary;
    }
    private int getId() {
        return id;
    }

    private int setSalary(int salary) {
        return salary;
    }

    private int setDepartment(int department) {
        return department;
    }

    public String toString() {
        return "Полное имя:" + fullName + "; " + "Отдел:" + department + "; " + "Зарпалата:" +salary+ "; " + "id:" + id;
    }
}

