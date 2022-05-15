package ru.skypro;

public class EmployeeBook {
    private final Employee[] employees = {
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


    public void allData() {
        for (int i = 0; i < 10; i++)
            System.out.println(employees[i]);
    }

    private double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public void printSum(){
        System.out.println("Сумма всех ЗП: " + sumSalary());
    }

    public void minSalary() {
        int min = employees[0].getSalary();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();

            }
        }
        System.out.println("Минимальная ЗП сотрудников: " + min);
    }
    public void maxSalary() {
        int max = employees[0].getSalary();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();

            }
        }
        System.out.println("Максимальная ЗП сотрудников: " + max);
    }

    public void averageSalary() {
        System.out.println("Средняя ЗП сотрудников: " + sumSalary() / employees.length);
    }

    public void allFirstName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].getFullName() + "; ");
        }
    }
}
