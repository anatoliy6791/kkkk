package ru.skypro;

public class Main {

public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов М. Ю.", 50200, 1);
        employees[1] = new Employee("Петров В. А. ", 100000, 2);
        employees[2] = new Employee("Ефремов А. Б.", 70000, 3);
        employees[3] = new Employee("Березин В. В.", 80000, 4);
        employees[4] = new Employee("Калмыков В. В.", 20362, 1);
        employees[5] = new Employee("Дубов В. В.", 35342, 2);
        employees[6] = new Employee("Уленов В. В.", 40240, 3);
        employees[7] = new Employee("Соснов В. В.", 50870, 4);
        employees[8] = new Employee("Липов В. В.", 60000, 1);
        employees[9] = new Employee("Дружко В. В.", 70000, 2);
        allData(employees);
        allFirstName(employees);
        System.out.println();
        sumSalary(employees);
        minSalary(employees);
        maxSalary(employees);
        averageSalary(employees);
        }

public static void allData(Employee ss[]) {
        for (int i = 0; i < ss.length; i++)
        System.out.println(ss[i]);
        }

public static void sumSalary(Employee ss[]) {
        int sum = 0;
        for (int i = 0; i < ss.length; i++) {
        sum = sum + ss[i].salary;
        }
        System.out.println("Общая ЗП сотрудников: " + sum);
        }

public static void minSalary(Employee ss[]) {
        int min = ss[0].salary;

        for (int i = 0; i < ss.length; i++) {
        if (ss[i].salary < min) {
        min = ss[i].salary;

        }
        }
        System.out.println("Минимальная ЗП сотрудников: " + min);
        }
public static void maxSalary(Employee ss[]) {
        int max = ss[0].salary;

        for (int i = 0; i < ss.length; i++) {
        if (ss[i].salary > max) {
        max = ss[i].salary;

        }
        }
        System.out.println("Максимальная ЗП сотрудников: " + max);
        }

public static void averageSalary(Employee ss[]) {
        double sum = 0;
        for (int i = 0; i < ss.length; i++) {
        sum = sum + ss[i].salary;
        }
        System.out.println("Средняя ЗП сотрудников: " + sum/ ss.length);
        }

public static void allFirstName(Employee ss[]) {
        for (int i = 0; i < ss.length; i++) {
        System.out.print(ss[i].fullName + "; ");
        }
        }
        }
