package homeworks.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        // Ստուգում ենք, թե արդյոք արդյունքների մեջ կա այս ID-ով աշխատակից
        if (searchByEmployeeID(employee.getEmployeeID()) != null) {
            System.out.println("Employee with ID " + employee.getEmployeeID() + " already exists.");
            return; // Եթե կա, դուրս ենք գալիս մեթոդից և չենք ավելացնում
        }
        if (size == employees.length) {
            extendStorage();

        }
        employees[size++] = employee;
        System.out.println("Employee successfully added!");
    }

    private void extendStorage() {
        Employee[] tmp = new Employee[employees.length + 10];
        for (int i = 0; i < employees.length; i++) {
            tmp[i] = employees[i];
        }
        employees = tmp;
    }

    public void print() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println(employees[i]);
            System.out.println();

        }
    }

    public Employee searchByEmployeeID(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                return employees[i];
            }

        }
        return null;
    }

    public void searchByCompany(String companyName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equalsIgnoreCase(companyName)) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " - " + employees[i].getPosition());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company " + companyName + ".");
        }
    }

    public void searchByMinSalary(double minSalary) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= minSalary) {
                System.out.println(employees[i]); // Տպում ենք ամբողջական տվյալները կամ պահանջված ձևաչափով
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with salary >= " + minSalary);
        }
    }
    public void deleteEmployeeByID(String employeeID) {
        int index = -1;
        // 1. Գտնում ենք հեռացվող աշխատակցի ինդեքսը զանգվածում
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                index = i;
                break;
            }
        }

        // Եթե աշխատակիցը չի գտնվել
        if (index == -1) {
            System.out.println("Employee with ID " + employeeID + " not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[size - 1] = null;
        size--;
        System.out.println("Employee successfully deleted!");
    }
}
