import java.util.Scanner;
class ATM
{
    public double amount = 10000.0;
    //computing withdraw operation
    public void withdraw(double amount)
    {
        if(this.amount<amount)
        {
            System.out.println("Insufficient Balance!Unable to complete the transation.\n");
        }
        else
        {
            this.amount -= amount;
            //Displaying balance after withdraw operation
            balance();
        }
    }
    public void deposit(double amount)
    {
        this.amount += amount;
        //Displaying balance after deposit operation
        balance();
    }
    public void balance()
    {
        System.out.println("Balance Amount :"+amount+" INR\n");
    }
}
public class ATMSystem
{
    public static void main(String arg[])
    {
        System.out.println("Welcome to ATM System!");
        System.out.println("\nPlease choose any one of the operations:\n");
        ATM obj = new ATM();
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Withdraw\t2.Deposit\t3.Balance Enquiry\t4.Exit Transaction\n");
            System.out.println("Please enter your choice:");
            choice = s.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Please enter the amount to withdraw:");
                    double WithdrawAmount = s.nextDouble();
                    obj.withdraw(WithdrawAmount);
                    break;
                case 2:
                    System.out.println("Please enter the amount to deposit:");
                    double DepositAmount = s.nextDouble();
                    obj.deposit(DepositAmount);
                    break;
                case 3:
                    System.out.println("Processing Balance Details: ");
                    obj.balance();
                    break;
                case 4:
                    System.out.println("Terminating transaction process!");
                    System.out.println("Transaction Successful!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!.Please enter a valid one.");
            }
        }while(choice<=4);
    }
}
