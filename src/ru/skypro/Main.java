package ru.skypro;

public class Main {
        public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов М. Ю.", 50200, 1),
                new Employee("Петров В. А. ", 100000, 2),
                new Employee("Ефремов А. Б.", 70000, 3),
                new Employee("Березин В. В.", 80000, 4),
                new Employee("Калмыков В. В.", 20362, 1),
                new Employee("Дубов В. В.", 35342, 2),
                new Employee("Уленов В. В.", 40240, 3),
                new Employee("Соснов В. В.", 50870, 4),
                new Employee("Липов В. В.", 60000, 1),
                new Employee("Дружко В. В.", 70000, 2),
};
        allData(employees);
        allFirstName(employees);
        System.out.println();
        sumSalary(employees);
        minSalary(employees);
        maxSalary(employees);
        averageSalary(employees);
        }

private static void allData(Employee ss[]) {
        for (int i = 0; i < ss.length; i++)
        System.out.println(ss[i]);
        }

private static void sumSalary(Employee ss[]) {
        int sum = 0;
        for (int i = 0; i < ss.length; i++) {
        sum = sum + ss[i].getSalary();
        }
        System.out.println("Общая ЗП сотрудников: " + sum);
        }

private static void minSalary(Employee ss[]) {
        int min = ss[0].getSalary();

        for (int i = 0; i < ss.length; i++) {
        if (ss[i].getSalary()< min) {
        min = ss[i].getSalary();

        }
        }
        System.out.println("Минимальная ЗП сотрудников: " + min);
        }
private static void maxSalary(Employee ss[]) {
        int max = ss[0].getSalary();

        for (int i = 0; i < ss.length; i++) {
        if (ss[i].getSalary() > max) {
        max = ss[i].getSalary();

        }
        }
        System.out.println("Максимальная ЗП сотрудников: " + max);
        }

private static void averageSalary(Employee ss[]) {
        double sum = 0;
        for (int i = 0; i < ss.length; i++) {
        sum = sum + ss[i].getSalary();
        }
        System.out.println("Средняя ЗП сотрудников: " + sum/ ss.length);
        }

private static void allFirstName(Employee ss[]) {
        for (int i = 0; i < ss.length; i++) {
        System.out.print(ss[i].getFullName());
                if (i < ss.length - 1) {
                        System.out.print(";");
                }
        }
   }
}
