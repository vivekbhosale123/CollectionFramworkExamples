package map;

import ListExample.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAdvanceExample {

    static void main(String[] args) {
        List<Employee> list = Stream.of(new Employee(1, "vivek", 8970.90),
                new Employee(2, "sachin", 4970.90),
                new Employee(3, "ramesh", 6970.90),
                new Employee(4, "bandesh", 7970.90),
                new Employee(5, "angad", 8970.90)).toList();

        // convert list into map

        Map<Integer,Employee> mapList=list.stream().collect(Collectors.toMap(Employee::getEmpId,employee -> employee));

        mapList.forEach((k,v)->{
            IO.println(k+"  "+v);
        });
    }

}
