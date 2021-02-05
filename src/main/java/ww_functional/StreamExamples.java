package ww_functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) throws IOException {

        // Read in csv file
        List<Employee> employees = Files.lines(Path.of("./src/main/java/ww_functional/salaries.csv"))
                // skip header
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Employee(s[0], s[1], Double.parseDouble(s[2])))
                .collect(Collectors.toList());


        // print first 5 persons, alphabetically
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .limit(5)
                .forEach(System.out::println);

        // Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getJobTitle));
        System.out.println();

        // Print most-earning employees in one line
        System.out.println(employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(5)
                .map(o -> String.format("%s: %.2f", o.getName(), o.getSalary()))
                .collect(Collectors.joining("; "))
        );

        System.out.println();

        // Print salary statistics
        DoubleSummaryStatistics statistics = employees.stream()
                .mapToDouble(Employee::getSalary)
                .summaryStatistics();

        System.out.println(statistics);
        System.out.println();


        // Count employees by their first character
        Map<Character, Long> byCharacter = employees.stream()
                .collect(Collectors.groupingBy(o -> o.getName().charAt(0), Collectors.counting()));

        System.out.println(byCharacter);
        System.out.println();


        // Print tags of most payed jobs
        Map<String, Double> tags = employees.stream()
                .flatMap(e -> Arrays.stream(e.getJobTitle().split(" ")).map(tag -> new Object[]{tag, e.getSalary()}))
                .collect(Collectors.groupingBy(array -> (String) array[0], TreeMap::new, Collectors.averagingDouble(array -> (double) array[1])));

        tags.entrySet()
                .stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(10)
                .forEach(System.out::println);
    }

}
