package CompanyRoster02;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employee;

    public Department(String name) {
        this.name = name;
        employee = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public double calculateAverage() {
        return this.employee.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }
}
