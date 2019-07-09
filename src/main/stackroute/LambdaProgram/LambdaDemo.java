/*
 1)Create Employee class having 3 fields name as age , name and lastname.
  Generate constructor and getter/setter.
  Create LambdaDemoClass this class will create List objects of type Employees.
  Following implementation needs to be done

  a)Sort the list by lastname.
  b)print all employee whose lastname starts with ‘C’
 */
package main.stackroute.LambdaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaDemo
{
    public static void main(String[] args)
    {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ruskin", "Bond", 82));
        employees.add(new Employee("Stark", "Chambers", 26));
        employees.add(new Employee("Chacha", "Choudhary", 714));
        employees.add(new Employee("Ryan", "Choi", 46));
        Comparator<Employee> comp= (o1, o2) -> o1.lastname.compareTo(o2.lastname);
        Collections.sort(employees,comp);
        System.out.println("Name of Persons :");
        employees.forEach(System.out::println);
        System.out.println("");
        System.out.println("Name of Persons Starting with C");
        employees.stream()
                .filter(employee -> employee.getLastname().startsWith("C"))
                .forEach(System.out::println);



    }
}
