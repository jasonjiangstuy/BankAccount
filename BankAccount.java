public class BankAccount{
    private double balance;
    private int accountID;
    private String passward;

    /*Sole constructor requires all field's values*/
    public BankAccount(  int accountID, String password){
        this.balance = 0;
        this.accountID = accountID;
        this.passward = password;
    } 

    /*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */ 
    public String toString(){
        return (Integer.toString(this.accountID)+ "\t" + String.valueOf(this.accountID));
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
        this.passward = newPass;
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
}


