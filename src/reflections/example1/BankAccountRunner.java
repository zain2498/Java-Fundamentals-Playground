package reflections.example1;

/*
* Reflection is most commonly used in unit testing — especially when:
You need to test or verify private methods or fields.
The class is from legacy code or third-party libraries where you can’t modify access levels.
You want to isolate and validate internal logic without changing the production code.
* */
public class BankAccountRunner {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        double interest= savingAccount.testInterestCalculation();
        System.out.println("Calculated interest is: $"+interest);
    }
}

