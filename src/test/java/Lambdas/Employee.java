package Lambdas;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Employee {
    String name;
    int age;
    int salary;
}
