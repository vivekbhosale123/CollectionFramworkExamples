package ListToMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {

    private int empId;

    private String empName;

    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

}

public class ListToMapApplication {

    static void main(String[] args) {

        List<Employee> list = Stream.of(new Employee(1, "vivek", 89799.90),
                new Employee(2, "sachin", 88799.90),
                new Employee(3, "paru", 79799.90)).toList();


        Map<Integer, Employee> hashMap = list.stream().collect(Collectors.toMap(Employee::getEmpId, employee -> employee));

        hashMap.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

    }

}
