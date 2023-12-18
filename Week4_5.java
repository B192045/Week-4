import java.util.*;

class Bank{
 String username;
 String password;
 double balance;
 Bank(String username,String password,int balance){
 this.username=username;
 this.password=password;
 this.balance=balance;}
 
 void credit(int amount,int ndex,int jindex,Bank[][] b){
 b[ndex][jindex].balance=b[ndex][jindex].balance+amount;
 System.out.println(b[ndex][jindex].balance);}

  void debit(int amount,int ndex,int jindex,Bank[][] b){
b[ndex][jindex].balance=b[ndex][jindex].balance-amount;
 System.out.println(b[ndex][jindex].balance);}

  void display(int ndex,int jindex,Bank[][] b){
 System.out.println(b[ndex][jindex].balance);}
 }

class Week4_5{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
 int flag=0,ndex=0,jindex=0;
 Bank[][] b=new Bank[2][2];
 b[0][0]=new Bank("aish","aish2045",2000);
 b[0][1]=new Bank("amu","amu2025",3000);
 b[1][0]=new Bank("bharath","bhar",4000);
 b[1][1]=new Bank("bhare","ds",5000);
 //b[0][0].show(b);
 System.out.println("Select ur username and password: ");
 String user=sc.nextLine();
 String password=sc.nextLine();
 for(int i=0;i<2;i++){
  for(int j=0;j<2;j++){
 if (b[i][j].username.equals(user) && b[i][j].password.equals(password)) {
                    System.out.println("your initial balance is: " + b[i][j].balance);
                   ndex=i;
                   jindex=j;
                    flag = -1;  // Set flag to -1 to indicate successful login
                    break;
               }
            }
        }

     if (flag != -1)
            System.out.println("Invalid");
if(flag==-1){
System.out.println("Enter operation to be performed: ");
int a=sc.nextInt();
switch(a){
case 1:
System.out.println("Enter amount to be credited: ");
int amount=sc.nextInt();
b[ndex][jindex].credit(amount,ndex,jindex,b);
break;
case 2:
System.out.println("Enter amount to be debited: ");
int amoun=sc.nextInt();
b[ndex][jindex].debit(amoun,ndex,jindex,b);
break;
case 3:
b[ndex][jindex].display(ndex,jindex,b);
break;
case 4:
System.exit(0);
break;}
}}}
    
 

 