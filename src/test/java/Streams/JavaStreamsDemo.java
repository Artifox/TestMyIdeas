package Streams;

import Lambdas.Employee;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsDemo {

    @Test
    public void streamsDemo() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        List<String> newFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        List<String> newFruits1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(newFruits1);

        /*for (String s : list){
            System.out.println(s);
        }
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        /*Stream<String> stream = list.stream();
        stream.forEach(x -> System.out.println(x));*/
        //list.stream().forEach(x -> System.out.println(x ));

    }

    @Test
    public void EmployeeSortingTest() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Employee.builder().age(23).name("John").salary(3000).build());
        employeeList.add(Employee.builder().age(28).name("Ed").salary(9000).build());
        employeeList.add(Employee.builder().age(32).name("Michel").salary(2000).build());

        List<Employee> sortedList = employeeList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        }).collect(Collectors.toList());
        System.out.println(sortedList);

        List<Employee> sortedList2 = employeeList.stream().sorted((o1,o2) -> o1.getSalary() - o2.getSalary()).collect(Collectors.toList());
        System.out.println(sortedList2);
    }
}
