package SystemDesign.StructuralDesignPatterns.CompositePattern;

public class Manager implements Employee {
    private String name;
    private long empId;
    private String department;

    public Manager(long empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager [ID: " + empId + ", Name: " + name + ", Department: " + department + "]");
    }
}
