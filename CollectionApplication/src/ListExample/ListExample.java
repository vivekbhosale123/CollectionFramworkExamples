package ListExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListExample {

    static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 5, 6, 6, 3, 2, 1, 8,8);

        // sort integer list
//        list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).toList().forEach(System.out::println);

        // sum of integers

//        int sum=list.stream().collect(Collectors.summingInt(Integer::intValue));
        // or
//        int sum=list.stream().mapToInt(Integer::intValue).sum();
//
//        IO.println(sum);

        // avg of integers

//       double avg= list.stream().collect(Collectors.averagingDouble(Integer::intValue));
//
//       IO.println(avg);

        // second largest number of integer list

 //       int secondLargest = list.stream().distinct().sorted(Comparator.comparing(Integer::intValue).reversed()).toList().get(1);
//
//       IO.println(secondLargest);

//        Reapeated numbers


        Map<Integer, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

//        map.forEach((k,v)->{
//            if(v>1)
//            {
//                IO.println(k+" "+v);
//            }
//        });

        // or

        map.entrySet().stream().filter(n->n.getValue()>1).forEach(System.out::println);

    }

}
