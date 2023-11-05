// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        //Account class

        Account a1 = new Account("1234", "nada" , 1000);
        Account a2 = new Account("1234", "nada");
        Account a3 = new Account("123","nasser", 3000);


        System.out.println("-----Object 1--------");
        a1.setId("1234");
        a1.setName("Nada");
        a1.setBalance(1000);


        System.out.println("-----credit --------");
        System.out.println(a1.credit(200));
        System.out.println("-----debit --------");
        System.out.println(a1.debit(50));
        System.out.println("-----print Balance --------");
         a1.checkBalance();
        System.out.println("-----print all data --------");
        System.out.println(a1.toString());


        System.out.println("-----Object 3--------");


        a3.setId("9876");
        a3.setName("Nasser");
        a3.setBalance(3000);
        System.out.println("-----print Balance --------");
        a3.checkBalance();
        System.out.println("-----print all data --------");
        System.out.println(a3.toString());


        System.out.println("------transfer process-------");

        System.out.println("transfer  " + a1.transfer(a3, 10));
        System.out.println(a1.toString());
        System.out.println(a3.toString());



                //    Employee class

        Employee e1 = new Employee("12345" , "Saleh" , 8000);
        Employee e2 = new Employee("11334" , "Shahed" , 500);


        System.out.println("-----Object 1--------");
        e1.setId("12345");
        e1.setName("Saleh");
        e1.setSalary(8000);

        System.out.println(e1.toString());
        System.out.println("AnnualSalary = " + e1.getAnnualSalary());
        System.out.println(e1.raisedSalary(50));


        System.out.println("-----Object 2--------");

        e2.setId("11334");
        e2.setName("Shahed");
        e2.setSalary(15000);

        System.out.println(e2.toString());
        System.out.println("AnnualSalary = " + e2.getAnnualSalary());
        System.out.println(e2.raisedSalary( + 25));






    }
}