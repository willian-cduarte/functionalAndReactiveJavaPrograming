package org.example.functional.section12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {
    public static void main(String[] args) {

        Path path = Paths.get("file/EmployeeData.txt");

        try(Stream<String> lines = Files.lines(path)) {

            Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(",")));
            Spliterator<String> wordSpliterator = words.spliterator();
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);
            Stream<Employee> employees = StreamSupport.stream(employeeSpliterator, false);
            List<Employee> employeeList = employees.toList();
            List<String> employeeNames = employeeList.stream()
                    .map(Employee::getName)
                    .toList();

            employeeNames.forEach(System.out::println);
            System.out.println("-----X-------LIST---------X---");

            List<String> designationsList = employeeList.stream()
                    .map(Employee::getDesignation)
                    .toList();

            designationsList.forEach(System.out::println);
            System.out.println("-----X-------LIST---------X---");

            Set<String> designations = employeeList.stream()
                    .map(Employee::getDesignation)
                    .collect(Collectors.toSet());

            designations.forEach(System.out::println);
            System.out.println("-----X-------SET---------X---");

            // LIST -> aceita argumentos duplicados
            // SET -> não aceita argumentos duplicados

            TreeSet<Employee> employeesSorted = employeeList.stream()
                    .collect(Collectors.toCollection(TreeSet::new));

            TreeSet<Employee> employeeTreeSet = new TreeSet<>(employeeList);

            employeesSorted.forEach(System.out::println);
            System.out.println();
            employeeTreeSet.forEach(System.out::println);
            System.out.println("-----X-------Collection(TreeSet)---------X---");

            Map<Integer, String> getNameById = employeeList.stream()
                    .collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));

            System.out.println(getNameById);

            Map<Boolean, List<Employee>> partitionedData = employeeList.stream()
                    .collect(Collectors.partitioningBy(e -> e.getGender() == 'M'));

            List<Employee> maleEmployees = partitionedData.get(true);

            List<Employee> femaleEmployees = partitionedData.get(false);

            System.out.println(partitionedData);
            System.out.println(maleEmployees);
            System.out.println(femaleEmployees);

            Map<String, List<Employee>> getByDestinations = employeeList.stream()
                    .collect(Collectors.groupingBy(Employee::getDesignation));

            System.out.println(getByDestinations);

            Long collect = employeeList.stream()
                    .map(Employee::getSalary)
                    .count(); //.collect(Collectors.counting());

            System.out.println(collect);

            System.out.println("-----X-------Map---------X---");

            String employeeNamesString = employeeList.stream()
                    .map(Employee::getName)
                    .collect(Collectors.joining(", "));

            System.out.println(employeeNamesString);

            System.out.println("-----X-------String---------X---");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
