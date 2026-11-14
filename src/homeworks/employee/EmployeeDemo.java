package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompanyStorage companyStorage = new CompanyStorage();
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("5 - ADD COMPANY");
            System.out.println("6 - PRINT ALL COMPANIES");
            System.out.println("7 - SEARCH COMPANY BY ID");
            System.out.println("8 - PRINT EMPLOYEES BY COMPANY ID");
            System.out.println("9 - CHANGE EMPLOYEE COMPANY");
            System.out.println("10 - PRINT EMPLOYEE COMPANY");
            System.out.println("=========================================");
            System.out.print(" ");

            String commandStr = scanner.nextLine();
            int command;
            try {
                command = Integer.parseInt(commandStr);
            } catch (NumberFormatException e) {
                System.out.println(" մուտքագրել միայն թվային արժեք:");
                continue;
            }

            switch (command) {
                case 0:
                    isRun = false;
                    System.out.println("Ծրագիրն ավարտվեց։");
                    break;
                case 1:
                    System.out.print("Enter company ID: ");
                    String compId = scanner.nextLine();
                    Company company = companyStorage.getCompanyById(compId);

                    if (company == null) {
                        System.out.println("Company with ID " + compId + " not found.\nPlease add the company first.");
                        break;
                    }

                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee surname: ");
                    String surname = scanner.nextLine();
                    System.out.print("Enter employee ID: ");
                      String empId = scanner.nextLine();
                      System.out.print("Enter employee salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter employee position: ");
                    String position = scanner.nextLine();
                   
                    Employee employee = new Employee(name, surname, empId, salary,company, position);
                    employeeStorage.add(employee);
                    break;

                case 2: // PRINT ALL EMPLOYEES
                    employeeStorage.printAll();
                    break;

                case 3: // SEARCH EMPLOYEE BY ID
                    System.out.print("Enter employee ID: ");
                    String searchEmpId = scanner.nextLine();
                    Employee foundEmp = employeeStorage.getById(searchEmpId);
                    if (foundEmp != null) {
                        System.out.println("Employee found:\n" + foundEmp);
                    } else {
                        System.out.println("Employee with ID " + searchEmpId + " not found.");
                    }
                    break;

                case 4: // SEARCH EMPLOYEES BY COMPANY NAME
                    System.out.print("Enter company name: ");
                    String searchCompName = scanner.nextLine();
                    System.out.println("\nEmployees:");
                    employeeStorage.printByCompanyName(searchCompName);
                    break;

                case 5: // ADD COMPANY
                    System.out.print("Enter company ID: ");
                    String cId = scanner.nextLine();
                    System.out.print("Enter company name: ");
                    String cName = scanner.nextLine();
                    System.out.print("Enter industry: ");
                    String industry = scanner.nextLine();
                    System.out.print("Enter country: ");
                    String country = scanner.nextLine();

                    Company newComp = new Company(cId, cName, industry, country);
                    companyStorage.add(newComp);
                    break;

                case 6: // PRINT ALL COMPANIES
                    System.out.println("\nCompanies:");
                    companyStorage.printAll();
                    break;

                case 7: // SEARCH COMPANY BY ID
                    System.out.print("Enter company ID: ");
                    String sCompId = scanner.nextLine();
                    Company foundcompany = companyStorage.getCompanyById(sCompId);
                    if (foundcompany != null) {
                        System.out.println("Company found:\nID: " + foundcompany.getCompanyId() +
                                "\nName: " + foundcompany.getName() +
                                "\nIndustry: " + foundcompany.getIndustry() +
                                "\nCountry: " + foundcompany.getCountry());
                    } else {
                        System.out.println("Company not found.");
                    }
                    break;

                case 8: // PRINT EMPLOYEES BY COMPANY ID
                    System.out.print("Enter company ID: ");
                    String targetCompId = scanner.nextLine();
                    Company targetComp = companyStorage.getCompanyById(targetCompId);
                    if (targetComp != null) {
                        System.out.println("\nCompany: " + targetComp.getName());
                        System.out.println("\nEmployees:");
                        employeeStorage.printByCompanyId(targetCompId);
                    } else {
                        System.out.println("Company not found.");
                    }
                    break;

                case 9: // CHANGE EMPLOYEE COMPANY
                    System.out.print("Enter employee ID: ");
                    String chEmpId = scanner.nextLine();
                    Employee chEmp = employeeStorage.getById(chEmpId);

                    if (chEmp == null) {
                        System.out.println("Employee not found.");
                        break;
                    }

                    System.out.println("Current company: " + (chEmp.getCompany() != null ? chEmp.getCompany().getName() : "None"));
                    System.out.print("Enter new company ID: ");
                    String newCompId = scanner.nextLine();
                    Company newCompany = companyStorage.getCompanyById(newCompId);

                    if (newCompany != null) {
                        chEmp.setCompany(newCompany);
                        System.out.println("Employee company successfully changed!\n\nNew company: " + newCompany.getName());
                    } else {
                        System.out.println("New company not found. Employee's company remains unchanged.");
                    }
                    break;

                case 10: // PRINT EMPLOYEE COMPANY
                    System.out.print("Enter employee ID: ");
                    String prEmpId = scanner.nextLine();
                    Employee prEmp = employeeStorage.getById(prEmpId);

                    if (prEmp != null && prEmp.getCompany() != null) {
                        Company cInfo = prEmp.getCompany();
                        System.out.println("\nEmployee: " + prEmp.getName() + " " + prEmp.getSurname());
                        System.out.println("\nCompany information:\nID: " + cInfo.getCompanyId() +
                                "\nName: " + cInfo.getName() +
                                "\nIndustry: " + cInfo.getIndustry() +
                                "\nCountry: " + cInfo.getCountry());
                    } else {
                        System.out.println("Employee or company information not found.");
                    }
                    break;
                case 11:
                    System.out.println("Enter employee ID to delete:");
                    String employeeIdToDelete = scanner.nextLine();

                    // Կանչում ենք EmployeeStorage-ի ջնջելու մեթոդը
                    employeeStorage.deleteById(employeeIdToDelete);
                    break;

                    // Case 12: Ընկերության հեռացում պայմանով (Bonus 5)
                case 12:
                    System.out.println("Enter company ID to delete:");
                    String companyIdToDelete = scanner.nextLine();

                    // 1. Ստուգում ենք՝ արդյոք տվյալ ընկերությունում կան աշխատակիցներ
                    int employeeCount = employeeStorage.countByCompanyId(companyIdToDelete);

                    // 2. Ստուգում ենք պայմանը
                    if (employeeCount > 0) {
                        System.out.println("Cannot delete company.");
                        System.out.println("Company has " + employeeCount + " employees.");
                    } else {
                        // Եթե աշխատակիցներ չկան, ջնջում ենք ընկերությունը
                        companyStorage.deleteById(companyIdToDelete);
                        System.out.println("Company successfully deleted!");
                    }
                    break;

                default:
                    System.out.println("Invalid command! Please choose between 0 and 10 ");
            }
        }
        scanner.close();
    }
}