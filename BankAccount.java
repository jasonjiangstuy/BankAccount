import sun.security.ec.point.Point;

public class BankAccount{
    private double balance;
    private int accountID;

    public String password;
    // private String passward;

    /*Sole constructor requires all field's values*/
    public BankAccount(  int accountID, String password){
        this.balance = 0;
        this.accountID = accountID;
        this.password = password;
    } 

    /*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */ 
    public String toString(){
        return ('#' + Integer.toString(this.accountID)+ "\t" + '$' + String.valueOf(this.balance));
    } 

    /*standard accessor methods*/ 
    public double getBalance(){
        return this.balance;
    } 
    public int getAccountID(){
        return this.getAccountID();
    } 
 
    /*Change the value of password to the specified value 
    *@param newPass The value to replace the old password with*/ 
    public void setPassword(String newPass){
        this.password = newPass;
    } 
 
    /*Only when amount is positive: Increase balance by amount and return true. 
    *@return When amount is positive: Return true, otherwise return false. 
    *@param amount The amount is how much to change the balance by.
    */ 
    public boolean deposit(double amount){
        if (amount >= 0){
            this.balance += amount;
            return true;
        }
        else{
            return false;
        }
    } 
    
    /*Only when amount is positive and the amount does not exceed the balance: 
    *Decrease balance by amount and return true, return false otherwise.
    *Make no change if the amount is too large to withdraw 
    *@param amount The amount is how much to change the balance by.
    *@return true when the balance is large enough, false otherwise.
    */ 
    public boolean withdraw(double amount){
        if (amount <= this.balance){
            this.balance -= amount;
            return true;
        }
        else{
            return false;
        }

    }

    /*This private method will allow internal methods to check the password easily*/
/**Determine if the password in the object is the same as the parameter.
 *@param password to be checked against the object's password (remember the distinction between this.x and x)
 *@return true if the passwords are the same, false otherwise.
 */
private boolean authenticate(String password){
    return this.password.equals(password);
}

/**Transfer money from this BankAccount to the other only when the password matches, and the withdrawal succeeds.
 *@param other which BankAccount to GIVE the money to
 *@param amount how much money to transfer, negative amounts will make this operation fail.
 *@param password to be checked against the source account, incorrect password will make this operation fail.
 *@return true if money is successfully transfered, false otherwise.
 */
public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password)){
        if (withdraw(amount)){
            if (other.deposit(amount)){
                return true;
            }
            else{
                System.out.println("bad uh oh i messed u");
            }
        }
        

        
    }
    
    return false;

}
}


