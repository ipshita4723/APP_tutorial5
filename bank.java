 class BankAccount{
    private double balance;
    public int accNo;
    public String accName;
public BankAccount(double balance,int accNo,String accName){
    this.balance = balance;
    this.accNo = accNo;
    this.accName = accName;
}
    public double getBalance() {
        return balance;
    }

 
public double deposit(double deposit ){
    return this.balance +=deposit;
}
public double withdraw(double withdraw){
   return this.balance -=withdraw;
}

}
public class bank{
    public static void main(String[] args){
        BankAccount a1=new BankAccount(500,1234,"abc");
        System.out.println("bank details:");
        System.out.println("Accno:"+a1.accNo);
        System.out.println("Accname:"+a1.accName);
        System.out.println("balance:"+a1.getBalance());
        System.out.println("balance after deposit:"+a1.deposit(200));
        System.out.println("balance after withdrawing:"+a1.withdraw(100));
    }
}