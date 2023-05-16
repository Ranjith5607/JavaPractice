package stream;


import java.util.*;
import java.util.stream.Collectors;

class Employee {

    private int id;
    private String empName;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String empName, double salary) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
    }
}

public class FindtheMaxSalaryAndMinSalaryAndSecondSalary {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "A", 1000.00));
        employees.add(new Employee(2, "B", 2000.00));
        employees.add(new Employee(3, "C", 3000.00));

        //salary max

        Employee employee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println(employee);

        //salary min
        Employee employee1 = employees.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println(employee1);

        //second highest salary
        List<Employee> collect = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).collect(Collectors.toList());
        System.out.println("");

        System.out.println(collect.get(0));


        //to convert  list to set

        Set<Double> setData = employees.stream().map(m -> m.getSalary()).filter(salary -> salary > 1).collect(Collectors.toSet());

        System.out.println(setData);

        //to convert  list to Map

        Map<Integer, String> empDataMap = employees.stream().collect(Collectors.toMap(e -> e.getId(), e -> e.getEmpName()));
        System.out.println(empDataMap);



    }
}
