//1. Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.
class InsufficientFundsException extends Exception{
  InsufficientFundsException(String str){
    super(str);
  }
}
class BankAccount{
  int balance=10000;
  void deposit(int amount){
    balance=balance+amount;
    System.out.println("Balance is:"+balance);
  }
   void checkBalance(){
    System.out.println("Balance is:"+balance);
  }
  void withdraw(int amount) throws InsufficientFundsException{
    if(amount>balance){
      throw new InsufficientFundsException("Insuffiecient balance");
    }
    else{
      balance=balance-amount;
      System.out.println("Balance is:"+balance);
    }
  }
 
}
class BankDemo{
  public static void main(String args[]){
    BankAccount b=new BankAccount();
    b.deposit(2000);
    b.checkBalance();
    try{
      b.withdraw(20000);
    }
    catch(InsufficientFundsException e){
      System.out.println(e);
    }
  
  }
}