package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{

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

    @Override
    public int compareTo(Employee e1) {

        if(empSalary==e1.getEmpSalary())
        {
            return 0;
        } else if (empSalary<e1.getEmpSalary()) {
            return 1;
        }else {
            return -1;
        }

    }
}

public class ComparableApplication {

    static void main(String[] args) {

        List<Employee> list=new ArrayList<>();

        list.add(new Employee(1,"vivek",989.90));
        list.add(new Employee(1,"ajay",789.90));
        list.add(new Employee(1,"ganesh",689.90));
        list.add(new Employee(1,"ranu",9089.90));

        Collections.sort(list);

        list.stream().forEach(System.out::println);
    }

}
