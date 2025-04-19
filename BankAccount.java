class BankAccount{

double getInterestRate() {
return 0.05;
}

}
class SavingsAccount extends BankAccount{
double getInterestRate() {
return 0.1;
}

}
class BankUser{
public static void main(String []args){
BankAccount user1= new BankAccount();
System.out.println(user1.getInterestRate());
SavingsAccount user2= new SavingsAccount();
System.out.println(user2.getInterestRate());

}
}