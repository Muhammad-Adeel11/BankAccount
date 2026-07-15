
package bankaccount;

public class BankAccount {
private String AccountNo;
private String AccountTitle;
private double AccountBalance;
public Boolean AccountStatus;
    public BankAccount() { // null constructor
        AccountTitle="Unknown";
        AccountNo= "N/A";
        AccountBalance=0.0;
    }
    public BankAccount(String ANo, String ATitle, double ABalance) { // parametrized
        this.AccountNo = ANo;
        this.AccountTitle = ATitle;
        this.AccountBalance = ABalance;
    }
    public BankAccount(BankAccount B){ // copy construcctor
        AccountTitle=B.AccountTitle;
        AccountNo=B.AccountNo;
        AccountBalance=B.AccountBalance;
    }   
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }
    public String getAccountNo() {
        return AccountNo;
    }
    public void setAccountTitle(String AccountTitle) {
        this.AccountTitle = AccountTitle;
    }
    public String getAccountTitle() {
        return AccountTitle;
    }
     public void setAccountBalance(double AccountBalance) {
        this.AccountBalance = AccountBalance;
    }
    public double getAccountBalance() {
        return AccountBalance;
    } 
     public void deposit(double amount){
           AccountBalance+=amount;
           System.out.println("Amount after Desposited cash : "+this.AccountBalance);
    }
      public void withdraw(double amount){
           AccountBalance-=amount; 
           System.out.println("Amount after withdrawed cash: "+this.AccountBalance);
    }
      public void transfer(BankAccount recipient, double amount){
          if(amount<=0){
              System.out.println("Invalid transfer amount.");
          }
          else if (AccountBalance<amount) {
          System.out.println("Insufficient balance for transfering.");
          } else {
              AccountBalance -= amount;
              recipient.AccountBalance+=amount;
              System.out.println("transfer amount " +amount+ " to" + " recipient " +recipient.AccountNo);
          }
      }
    
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount("A125","Adeel",10000);
        BankAccount b3=new BankAccount(b2);
        System.out.println("account number is: "+b2.AccountNo);
        System.out.println("Account title is: "+b2.AccountTitle);
        System.out.println("current balance is: "+b2.AccountBalance);
    
        b2.deposit(1000);
        b2.withdraw(500);
        b2.transfer(b3, 500);
    } 
}
