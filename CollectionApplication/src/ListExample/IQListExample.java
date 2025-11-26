package ListExample;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class IQListExample {

    static void main(String[] args) {

        List<Employee> list = Stream.of(new Employee(1, "vivek", 8970.90),
                new Employee(2, "sachin", 4970.90),
                new Employee(3, "ramesh", 6970.90),
                new Employee(4, "bandesh", 7970.90),
                new Employee(5, "angad", 8970.90)).toList();


        // sort by name

//        list.stream().sorted(Comparator.comparing(Employee::getEmpName)).toList().forEach(System.out::println);

        // sort by salary

     //   list.stream().sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).toList().forEach(System.out::println);

        // filter by salary

//        list.stream().filter(emp->emp.getEmpSalary()>=5000).forEach(System.out::println);

        // find second-largest salary

        Employee employee=  list.stream().sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).toList().get(1);

        IO.println(employee);



    }
}
