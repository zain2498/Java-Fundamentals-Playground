package designPatterns.FactoryMethod;

public class AndroidDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Android Developer Salary");
        return 50000;
    }
}
