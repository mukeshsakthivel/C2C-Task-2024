package Inheritance.MamTask;


import java.lang.reflect.AccessibleObject;

class  BankAccount{
    int accountNo,balance,interestRate;

    BankAccount(int accountNo)
    {
        this.accountNo=accountNo;
    }

    void deposite(int rup){
        balance=balance+rup;
    }
}
class SavingAccount extends BankAccount{
    int minimumBalance=500;

    SavingAccount(int accountNo)
    {
      super(accountNo);
    }

    void withdraw(int amount)
    {
        if(balance-amount>=minimumBalance)
        {
            balance=balance-amount;
        }
        else
        {
            System.out.println("insufficient balance");
        }
    }
    void balance(){
        System.out.println(balance);
    }
}
public class BankAccount_2Question {
    public static void main(String[] args) {
        SavingAccount sav=new SavingAccount(101);
        sav.deposite(1000);
        sav.balance();
        sav.withdraw(200);
        sav.balance();
    }
}
