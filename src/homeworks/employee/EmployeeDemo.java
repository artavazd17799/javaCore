package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("Please input 5 for SEARCH EMPLOYEES BY MINIMUM SALARY");
            System.out.println("Please input 6 for DELETE EMPLOYEE BY ID");
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    System.out.println("Program finished.");
                    break;
                case "1":
                    System.out.println("Please input employee name:");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname:");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee ID:");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input employee salary:");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input employee company:");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee position:");
                    String position = scanner.nextLine();
                    System.out.println("Please input 6 for DELETE EMPLOYEE BY ID");
                    Employee employee = new Employee(name, surname, employeeID, salary, company, position);
                    storage.add(employee);
                    System.out.println("Employee successfully added!");
                    break;
                case "2":
                    storage.print();
                    break;
                case "3":
                    System.out.println("Please input employee ID:");
                    String searchID = scanner.nextLine();
                    Employee foundEmployee = storage.searchByEmployeeID(searchID);
                    if (foundEmployee != null) {
                        System.out.println("Employee found:\n" + foundEmployee);
                    } else {
                        System.out.println("Employee with ID " + searchID + " not found.");
                    }
                    break;
                case "4":
                    System.out.println("Please input company name:");
                    String searchCompany = scanner.nextLine();
                    storage.searchByCompany(searchCompany);

                    break;
                case "5":
                    System.out.println("Please input minimum salary:");
                    double minSalary = Double.parseDouble(scanner.nextLine());
                    storage.searchByMinSalary(minSalary);
                    break;
                case "6":
                    System.out.println("Please input employee ID to delete:");
                    String deleteID = scanner.nextLine();
                    storage.deleteEmployeeByID(deleteID);
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
            }
            System.out.println();
        }
    }
}