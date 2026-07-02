package reflections.example1;

import java.lang.reflect.Method;
import java.util.logging.Logger;

public class SavingAccount extends BankAccount{

    public double testInterestCalculation(){
        try{
            Method method = BankAccount.class.getDeclaredMethod("calculateInterest");
            method.setAccessible(true);
            return (double) method.invoke(this);
        }catch (Exception e){
            System.out.println("exception in testInterestCalculation e "+ e);
        }
        return 0.0;
    }
}
