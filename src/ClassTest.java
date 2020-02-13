class Account{
    private int id;
    private double balance;
    private double annuallnterestRate = 0;
    private String dateCreated;

    public Account(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return this.annuallnterestRate % 12;
    }
    public double withDraw(double x){
        double y = balance - x;
        System.out.println("账户余额："+y);
        return x;
    }
    public void deposit(double x){
        double y = balance + x;
        System.out.println("账户余额："+y);

    }

}

public class ClassTest {
    public static void main(String[] args) {
        Account A = new Account();
        A.setId(1122);
        A.setBalance(20000);
        A.setAnnuallnterestRate(0.045);
        A.withDraw(2500);
        A.deposit(3000);

    }
}
