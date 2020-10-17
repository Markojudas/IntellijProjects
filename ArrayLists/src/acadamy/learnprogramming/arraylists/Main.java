package acadamy.learnprogramming.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        /*
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1)); //constant time

        System.out.println(employeeList.isEmpty());
         */

        employeeList.set(1, new Employee("John", "Adams", 4568)); //constant time since we know the index
        //employeeList.forEach(employee -> System.out.println(employee));

        //System.out.println(employeeList.size()); //the employees added to list

        employeeList.add(3, new Employee("John", "Doe", 4567)); //this is a linear time; O(n)
        //employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
