package SystemDesign.StructuralDesignPatterns.CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "Sankalp", "Frontend Developer");
        Developer dev2 = new Developer(101, "Aman", "Backend Developer");
        CompanyDirectory engineeringDirectory = new CompanyDirectory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        Manager mgr1 = new Manager(200, "Priya", "Engineering Manager");
        Manager mgr2 = new Manager(201, "Rohan", "Product Manager");
        CompanyDirectory managementDirectory = new CompanyDirectory();
        managementDirectory.addEmployee(mgr1);
        managementDirectory.addEmployee(mgr2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(engineeringDirectory);
        companyDirectory.addEmployee(managementDirectory);

        System.out.println("=== Company Employee Structure ===");
        companyDirectory.showEmployeeDetails();
    }
}
