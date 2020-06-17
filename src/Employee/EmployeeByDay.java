package Employee;

public class EmployeeByDay implements Employee {
    private String name;
    private  int salarySize;

    public EmployeeByDay(String name, int salarySize) {
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
        int day = hour/8;
        int salary = day*salarySize;
        System.out.println("hello my name is" + name + " m");
    }
}

