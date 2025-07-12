
import java.util.Locale;
import java.util.Scanner;


public class Main{
 public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner=new Scanner(System.in);

        Account account;

        System.out.println("entre com um numero");
        int number= scanner.nextInt();
        System.out.println("account holder dono:");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.println("is there an initial deposit (y/n)?");
        char response = scanner.next().charAt(0);
        if (response=='y'){
            System.out.println("enter initial deposti value ::");
            double initalDeposit= scanner.nextDouble();

            account=new Account(number,holder,initalDeposit);
        }else{
            account =new Account(number,holder);
        }

        System.out.println();
        System.out.println("account data");
        System.out.println(account);


        System.out.println();
        System.out.print("enter a deposit value");
        double depositValue =scanner.nextDouble();
        account.deposit(depositValue);
        System.out.println("update account data");
        System.out.println(account);


        System.out.println();
        System.out.print("enter a deposit value");
        double withdrawValue =scanner.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("update account data");
        System.out.println(account);

        scanner.close();
     }

}