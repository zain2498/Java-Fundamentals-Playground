package designPatterns.FactoryMethod;

public class EmployeeRunner {

    public static void main(String[] args) {
        Employee employee = FactoryEmployee.getEmployee("Web Developer");
        System.out.println(employee.getSalary());
    }
}
