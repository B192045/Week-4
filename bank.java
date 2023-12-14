import java.util.*;
class Account
{
    private double balance;
    public Account(double initialbalance)
    {
        if(initialbalance > 1000)
        {
        this.balance = initialbalance;
        }
        else
        {
            System.out.println("Initial Balance must be greater than 1000");
        }
    }
    public void credit(double amount)
    {
        balance += amount;
        System.out.println("Amount Credited :"+ amount);
    }
    public void debit(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println("Amount debited :"+ amount);
        }
        else
        {
            System.out.println("Insuffient Balance");
        }
    }
   public double getbalance()
    {
        return balance;
    }
   public void exit()
    {
        System.out.println("Exiting the Transaction :"+balance);
    }
}
class bank
{
    public static void main(String args[])
    {
        Account[][] accounts = new Account[2][5];
        initializeAccount(accounts);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter branch :");
            String branchName = sc.next();
            System.out.println("Enter Account No (1 to 5) :");
            int AccNo = sc.nextInt();
            int branchIndex = getbranchIndex(branchName);
            int customerIndex = getcustomerIndex(AccNo);
            if(branchIndex != -1 && customerIndex != -1)
            {
                Account currentAccount = accounts[branchIndex][customerIndex];
                performTransactions(currentAccount,sc);
                System.out.println("Exit Application (Yes/No):");
                String choice = sc.next().toLowerCase();
                if(choice.equals("yes"))
                {
                    break;
                }
                
            }
            else
            {
                System.out.println("Enter valid branch and Acc No");
            }
            
        }
    }
static void initializeAccount(Account[][] accounts)
    {
        accounts[0][0] = new Account(1500);
        accounts[0][1] = new Account(2000);
        accounts[0][2] = new Account(2500);
        accounts[0][3] = new Account(1800);
        accounts[0][4] = new Account(3500);

        accounts[1][0] = new Account(1700);
        accounts[1][1] = new Account(2600);
        accounts[1][2] = new Account(2200);
        accounts[1][3] = new Account(1900);
        accounts[1][4] = new Account(3200);
    }
    static int getbranchIndex(String branchName)
    {
        if(branchName.toLowerCase().equals("basar"))
            return 0;
        else
            return 1;
    }
    private static int getcustomerIndex(int AccNo)
    {
        if(AccNo >= 1 && AccNo <= 5)
            return AccNo -1;
        else
            return -1;
    }
     static void performTransactions(Account currentAccount,Scanner sc)
    {
        while(true)
        {
            System.out.println("Select Transaction :");
            System.out.println("1.credit");
            System.out.println("2.Debit");    
            System.out.println("3.View Balance"); 
            System.out.println("4.Exit");
            System.out.println("Enter Your Option for Transaction:");
            int option =  sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("Enter Amount to credit :");
                    double CreditAmount = sc.nextDouble();
                    currentAccount.credit(CreditAmount);
                    break;
                case 2:
                    System.out.println("Enter Amount to Debit :");
                    double DebitAmount = sc.nextDouble();
                    currentAccount.debit(DebitAmount);
                    break;
                case 3:
                    System.out.println("Current Balance : "+currentAccount.getbalance());
                    break;
                case 4:
                    currentAccount.exit();
                    return;
                default:
                    System.out.println("Enter a valid branch Name and Account Number");
            }    
           

        }
    }
}