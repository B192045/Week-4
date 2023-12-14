/*6. New year welcomes with a Grand sale from topmost E-commerce sites Amazon and Flipkart.
Design an application that prompts user to enter product name, company it belongs to and the 
quantity(Note : you can input more if your application requires) and suggest him/her(cost 
effective) where to buy the product either from Amazon or E-commerce. 
Amazon offers 10% Discount for HDFC credit card holders and 15% discount on purchase
above 50,000.
Flipkart offers 30% Discount if he/she is a RGUKT student and 5% discount on purchase above 
30,000*/

import java.util.*;

class Company{
 String product_name;
 String company_name;
 int quantity;
 int price;
 Company(String product_name,String company_name,int quantity,int price){
 this.product_name=product_name;
 this.company_name=company_name;
 this.quantity=quantity;
 this.price=price;}
 
 int cost(){
 return quantity*price;}}

class Amazon extends Company{
 boolean ishdfc;
 Amazon(String product_name,String company_name,int quantity,int price,boolean ishdfc){
 super(product_name,company_name,quantity,price);
 this.ishdfc=ishdfc;}
 
 int cost(){
 int costes=0;
 if(ishdfc){
 costes=10*(price)/100;}
 else if(price>50000){
 costes=15*(price)/100;}
 else
 costes=super.cost();
 return costes;}
 }

class Flipkart extends Company{
 boolean isrgukt;
 Flipkart(String product_name,String company_name,int quantity,int price,boolean isrgukt){
 super(product_name,company_name,quantity,price);
 this.isrgukt=isrgukt;}
 
 int cost(){
 int costd=0;
 if(isrgukt){
 costd=30*(price)/100;}
 if(price>30000){
 costd=5*(price)/100;}
 else
 costd=super.cost();
 return costd;}}

class Week4_6{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 String product_name;
 String company_name;
 int quantity;
 int price;
 int prices;
 System.out.println("Enter product_name: ");
 product_name=sc.nextLine();
 System.out.println("Enter company_name: ");
 company_name=sc.nextLine();
 System.out.println("Enter quantity: ");
 quantity=sc.nextInt();
 System.out.println("Enter price for amazon: ");
 price=sc.nextInt();
 System.out.println("Enter price for flipkart: ");
 prices=sc.nextInt();
 System.out.println("Enter true if u are hdfc holder: ");
 boolean hdfc=sc.nextBoolean();
 System.out.println("Enter true if u are rgukt holder: ");
 boolean rgukt=sc.nextBoolean();
 Company c=new Company(product_name,company_name,quantity,price);
 Amazon a=new Amazon(product_name,company_name,quantity,price,hdfc);
 Flipkart f=new Flipkart(product_name,company_name,quantity,prices,rgukt);
 System.out.println("Cost without any discount is: "+c.cost());
 System.out.println("Cost with amazon discount is: "+a.cost());
 System.out.println("Cost with flipkart discount is: "+f.cost());
 if(a.cost()<f.cost())
 System.out.println("Amazon");
 else
 System.out.println("Flipkart");}}
 

 
 