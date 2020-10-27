public class tester {
    public static void main(String args[]){


        // HW 12
        BankAccount x = new BankAccount(1234, "Test");

        // test toString()
        System.out.println(x.toString());
        System.out.println(x.toString().equals("1234\t0.0"));
        // true

        // test setPassword
        System.out.println(x.password);
        // "Test"
        x.setPassword("123");
        System.out.println(x.password);
        // "123"

        // Depost

        System.out.println(x.deposit(123));
        System.out.println(x.getBalance());
        System.out.println(x.withdraw(100));
        System.out.println(x.withdraw(23));
        System.out.println(x.getBalance());




        
    }
}
