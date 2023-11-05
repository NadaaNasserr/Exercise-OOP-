public class Account {
    private String id;
    private String name;
    private int balance =0;


    public Account(){

    }
    public Account(String id , String name){

    }
    public Account(String id , String name , int balance){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public int credit(int amount){

        if(amount >= this.balance){
            System.out.println("The balance is not enough for the credit process ");}
        else {
            this.balance = this.balance - amount;
            System.out.println(amount + "credit");
        }

return balance;

    }
    public  void checkBalance()
    {
        System.out.println("Balance = " + this.balance);
    }

    public int debit(int amount){

        this.balance = this.balance + amount;
        return balance;
    }
    public int transfer(Account a3, int amount){

        if(amount >= this.balance) {
            System.out.println("The balance is not enough for the transfer process");
        }
        else if (amount <= this.balance) {

            this.balance = this.balance - amount;
            System.out.println(amount + "  credit");
            a3.setBalance(a3.getBalance() + amount);


        }
        return getBalance();
    }


    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

