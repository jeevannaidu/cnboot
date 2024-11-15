package Basics;
import java.util.*;
import java.util.stream.Collectors;


public class StreamOperationsExample {
    public static void main(String[] args) {
        // Data Sets
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6);
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Bob");
        List<List<String>> nestedList = List.of(List.of("a", "b"), List.of("c", "d", "e"));
        List<Employee> employees = List.of(
                new Employee(1, "John", 50000),
                new Employee(2, "Jane", 60000),
                new Employee(3, "Jack", 70000)
        );

        // 1. filter: Get even numbers
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println("Filter (Even Numbers): " + evenNumbers);

        // 2. map: Convert all names to uppercase
        List<String> upperCaseNames = names.stream()
                                              .map(String::toUpperCase)
                                              .collect(Collectors.toList());
        System.out.println("Map (Uppercase Names): " + upperCaseNames);

        // 3. flatMap: Flatten a nested list of strings
        List<String> flattenedList = nestedList.stream()
                                             .flatMap(List::stream)
                                             .collect(Collectors.toList());
        System.out.println("FlatMap (Flattened List): " + flattenedList);

        // 4. distinct: Remove duplicates from the numbers list
        List<Integer> distinctNumbers = numbers.stream()
                                                .distinct()
                                                .collect(Collectors.toList());
        System.out.println("Distinct (Unique Numbers): " + distinctNumbers);

        // 5. sorted: Sort the numbers in descending order
        List<Integer> sortedNumbers = numbers.stream()
                                              .sorted(Comparator.reverseOrder())
                                              .collect(Collectors.toList());
        System.out.println("Sorted (Descending Numbers): " + sortedNumbers);

        // 6. peek: Log each element before converting to uppercase
        List<String> peekedNames = names.stream()
                                           .peek(name -> System.out.println("Peek: " + name))
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("Peek and Map: " + peekedNames);

        // 7. limit: Limit to first 3 numbers
        List<Integer> limitedNumbers = numbers.stream()
                                               .limit(3)
                                               .collect(Collectors.toList());
        System.out.println("Limit (First 3 Numbers): " + limitedNumbers);

        // 8. skip: Skip the first 2 numbers
        List<Integer> skippedNumbers = numbers.stream()
                                               .skip(2)
                                               .collect(Collectors.toList());
        System.out.println("Skip (After Skipping First 2): " + skippedNumbers);

        // 9. forEach: Print each employee's name
        System.out.print("ForEach (Employee Names): ");
        employees.stream().forEach(e -> System.out.print(e.getName() + " "));
        System.out.println();

        // 10. collect: Collect employee names into a list
        List<String> employeeNames = employees.stream()
                                             .map(Employee::getName)
                                             .collect(Collectors.toList());
        System.out.println("Collect (Employee Names List): " + employeeNames);

        // 11. count: Count number of employees
        long employeeCount = employees.stream().count();
        System.out.println("Count (Number of Employees): " + employeeCount);

        // 12. reduce: Sum of all salaries
        int totalSalary = employees.stream()
                                  .map(Employee::getSalary)
                                  .reduce(0, Integer::sum);
        System.out.println("Reduce (Total Salary): " + totalSalary);

        // 13. anyMatch: Check if there is any employee with salary > 60000
        boolean anyHighSalary = employees.stream()
                                        .anyMatch(e -> e.getSalary() > 60000);
        System.out.println("AnyMatch (Salary > 60000): " + anyHighSalary);

        // 14. allMatch: Check if all employees have salary > 40000
        boolean allHighSalary = employees.stream()
                                        .allMatch(e -> e.getSalary() > 40000);
        System.out.println("AllMatch (All Salary > 40000): " + allHighSalary);

        // 15. noneMatch: Check if no employee has salary < 30000
        boolean noneLowSalary = employees.stream()
                                        .noneMatch(e -> e.getSalary() < 30000);
        System.out.println("NoneMatch (No Salary < 30000): " + noneLowSalary);

        // 16. findFirst: Find the first number greater than 3
        Optional<Integer> firstNumber = numbers.stream()
                                                .filter(n -> n > 3)
                                                .findFirst();
        firstNumber.ifPresent(num -> System.out.println("FindFirst (First > 3): " + num));

        // 17. findAny: Find any name that starts with 'B'
        Optional<String> anyName = names.stream()
                                           .filter(name -> name.startsWith("B"))
                                           .findAny();
        anyName.ifPresent(name -> System.out.println("FindAny (Name starting with B): " + name));

        // 18. max: Find the employee with the maximum salary
        Optional<Employee> maxSalaryEmployee = employees.stream()
                                                       .max(Comparator.comparing(Employee::getSalary));
        maxSalaryEmployee.ifPresent(e -> System.out.println("Max (Max Salary Employee): " + e.getName()));

        // 19. min: Find the minimum number
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
        minNumber.ifPresent(num -> System.out.println("Min (Minimum Number): " + num));

        // 20. toArray: Convert numbers list to an array
        Integer[] numberArray = numbers.stream().toArray(Integer[]::new);
        System.out.println("ToArray (Numbers Array): " + Arrays.toString(numberArray));
    }
}

// Employee class for custom objects
class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getSalary() { return salary; }
}
