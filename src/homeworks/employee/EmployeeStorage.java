package homeworks.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }

        if (getById(employee.getEmployeeID()) != null) {
            System.out.println("Employee with ID " + employee.getEmployeeID() + " already exists!");
            return;
        }

        employees[size++] = employee;
        System.out.println("Employee successfully added!");
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee getById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void printByCompanyName(String name) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null && employees[i].getCompany().getName().equalsIgnoreCase(name)) {
                System.out.println(employees[i].getEmployeeID() + " - " + employees[i].getName() + " " + employees[i].getSurname());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company name: " + name);
        }
    }

    public void printByCompanyId(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null && employees[i].getCompany().getCompanyId().equals(id)) {
                System.out.println(employees[i].getEmployeeID() + " - " + employees[i].getName() + " " + employees[i].getSurname());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company ID: " + id);
        }
    }

    public int countByCompanyId(String companyId) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equals(companyId)) {
                count++;
            }
        }
        return count;
    }

    public double getTotalSalaryByCompanyId(String companyId) {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees != null && employees[i].getCompany() != null &&
                    employees[i].getCompany().getCompanyId().equals(companyId)) {
                totalSalary += employees[i].getSalary();
            }
        }
        return totalSalary;
    }

    public Employee getHighestSalaryEmployee() {
        if (size == 0) {
            return null;
        }
        Employee maxEmployee = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employees[i];
            }
        }
        return maxEmployee;
    }

    public void deleteById(String employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getEmployeeID().equals(employeeId)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee with ID " + employeeId + " not found.");
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
