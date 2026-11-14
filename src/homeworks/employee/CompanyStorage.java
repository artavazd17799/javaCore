package homeworks.employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;
    public void add(Company company){
        if (size == companies.length) {
            extend();
        }
        if(getCompanyById(company.getCompanyId()) != null){
            System.out.println("Company with ID " + company.getCompanyId() + " already exists!");
            return;
        }
        companies[size++] = company;
        System.out.println("Company successfully added!");
    }
    private void extend(){
        Company[]tmp = new Company[companies.length +10];
        System.arraycopy(companies, 0, tmp, 0, companies.length);
        companies = tmp;
    }
    public void printAll(){
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }
    public Company getCompanyById(String companyId){
        for (int i = 0; i < size; i++) {
            if(companies[i].getCompanyId().equals(companyId)){
                return companies[i];
            }

        }
        return null;
    }
    public void deleteById(String companyId){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (companies[i] != null && companies[i].getCompanyId().equals(companyId)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Company with ID " + companyId + " not found.");
            return;
        }

        // Ձախ տեղաշարժման ալգորիթմ
        for (int i = index; i < size - 1; i++) {
            companies[i] = companies[i + 1];
        }
        companies[size - 1] = null;
        size--;
    }

    }
