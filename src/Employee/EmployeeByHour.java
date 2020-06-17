package Employee;

public class EmployeeByHour implements Employee {
    private String name;
    private int salarySize;

    public EmployeeByHour(String name, int salarySize) {
        this.name = name;
        this.salarySize = salarySize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalarySize() {
        return salarySize;
    }

    public void setSalarySize(int salarySize) {
        this.salarySize = salarySize;
    }

    @Override
    public void paySalary(int hour) {
        int salary = salarySize * hour;
        System.out.println( "Hello my name is" + name +"hy salary" + salary);
    }
}
