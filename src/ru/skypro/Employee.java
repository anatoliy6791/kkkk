package ru.skypro;

public class Employee {
    private String fullName;
    private int salary;
    private int department;
    private static int counter;
    private int id;

    public Employee(String fullName, int salary, int department) {
        this.id = counter++;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int setSalary(int salary) {
        return salary;
    }

    public int setDepartment(int department) {
        return department;
    }
    @Override
    public String toString() {
        return "Полное имя:" + fullName + "; " + "Отдел:" + department + "; " + "Зарпалата:" + salary + "; " + "id:" + id;
    }
}

