package designPatterns.FactoryMethod;

public class FactoryEmployee {

    private static Employee employee;
    public static Employee getEmployee(String empType){

        if(empType.trim().equalsIgnoreCase("Android Developer")){
            employee =new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Web Developer")) {
             employee = new WebDeveloper();
        }else {
            System.out.println("There is no other developer");
            return null;
        }

        return employee;
    }

}
