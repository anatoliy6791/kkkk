package ru.skypro;

public class Main {
        private static Employee[] employees = new Employee[10];
        public static void main(String[] args){
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
                allData();
                printSum();
                allFirstName();
                System.out.println();
                averageSalary();
                maxSalary();
                minSalary();
        }
        private static void allData() {
                        for (int i = 0; i < 10; i++)
                                System.out.println(employees[i]);
                }
                private static double sumSalary() {
                        double sum = 0;
                        for (int i = 0; i < employees.length; i++) {
                                sum = sum + employees[i].getSalary();
                        }
                        return sum;
                }

        private static void printSum(){
                        System.out.println("Сумма всех ЗП: " + sumSalary());
                }

        private static void minSalary() {
                        int min = employees[0].getSalary();

                        for (int i = 0; i < employees.length; i++) {
                                if (employees[i].getSalary() < min) {
                                        min = employees[i].getSalary();

                                }
                        }
                        System.out.println("Минимальная ЗП сотрудников: " + min);
                }
        private static void maxSalary() {
                        int max = employees[0].getSalary();

                        for (int i = 0; i < employees.length; i++) {
                                if (employees[i].getSalary() > max) {
                                        max = employees[i].getSalary();

                                }
                        }
                        System.out.println("Максимальная ЗП сотрудников: " + max);
                }

        private static void averageSalary() {
                        System.out.println("Средняя ЗП сотрудников: " + sumSalary() / employees.length);
                }

                private static void allFirstName() {
                        for (int i = 0; i < employees.length; i++) {
                                System.out.print(employees[i].getFullName() + "; ");
                        }
                }
        }

