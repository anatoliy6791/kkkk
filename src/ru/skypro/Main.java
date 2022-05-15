package ru.skypro;

public class Main {
        public static void main(String[] args) {

                EmployeeBook employeeBook = new EmployeeBook();
                employeeBook.allData();
                employeeBook.printSum();
                employeeBook.allFirstName();
                System.out.println();
                employeeBook.averageSalary();
                employeeBook.maxSalary();
                employeeBook.minSalary();
   }
}
