/*4. RGUKT planned to provide vehicles (2 and 4 wheelers) to all class CR’s, and requested the 
company name and model of 2 and 4 wheelers from CR’s. As Indian market has lot of models 
in 2 wheelers and 4 wheelers, Mr. Ramesh is in dilemma to choose the best model among all 2 
wheelers and 4 wheelers. 
Write an application which compares the best model among 2 wheelers and 4 wheelers. 
Create a super class Vehicle, derive the sub-classes TwoWheeler and FourWheeler .
Two wheeler can have properties such as Company, Model, Mileage, Fuel Capacity, 
Displacement, Front Brake, Rear Brake, Tyre Type, Head lamp, User Reviews
Four wheeler can have properties such as Company, Model, Mileage, Fuel Capacity, 
Displacement, Air Conditioner, air bags, Power Steering, Rain Sensing Wiper.
Maintain atleast four 2-wheelers and Four 4-wheelers details in repository.
Application usage : Display all companies and models of 2 and 4 wheelers available in 
repository. User can choose any number of vehicles to compare, compare among them and 
display the Company and model of the vehicle to buy. If user opted for 2 wheeler, compare only 
2 wheeler vehicles and same with 4 wheeler*/

import java.util.*;

class Vehicle{
 String company;
 String model;
 int mileage;
 int fuel_capacity;
 int displacement;
 Vehicle(String company,String model,int mileage,int fuel_capacity,int displacement){
 this.company=company;
 this.model=model;
 this.mileage=mileage;
 this.fuel_capacity=fuel_capacity;
 this.displacement=displacement;}}

class Twowheeler extends Vehicle{
 boolean frontbrake;
 boolean rarebrake;
 String tyre_type;
 String head_lamp;
 String user_reviews;
 Twowheeler(String company,String model,int mileage,int fuel_capacity,int displacement,boolean frontbrake,boolean rarebrake,String tyre_type,String head_lamp,String user_reviews){
 super(company,model,mileage,fuel_capacity,displacement);
 this.frontbrake=frontbrake;
 this.rarebrake=rarebrake;
 this.tyre_type=tyre_type;
 this.head_lamp=head_lamp;
 this.user_reviews=user_reviews;}

 void show(Twowheeler t[]){
 for(int i=0;i<4;i++){
 System.out.println("company: "+t[i].company+" model: "+t[i].model);
 }}
 
 void compare(Twowheeler t[],int a[],int n){
 int max=0;
 int index=0;
 for(int i=0;i<n;i++){
 if(t[a[i]].mileage>max){
 max=t[a[i]].mileage;
 index=a[i];}}
 System.out.println("Buy this vehicle: "+t[index].company+" "+t[index].model);}}




class Week4_4{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 Twowheeler[] t;
 int n;
 t=new Twowheeler[4];
 t[0]=new Twowheeler("Hero","plus",60,20,30,true,true,"haha","led","positive");
 t[1]=new Twowheeler("Her","plus",80,20,30,true,true,"haha","led","positive");
 t[2]=new Twowheeler("Heroo","plus",90,20,30,true,true,"haha","led","positive");
 t[3]=new Twowheeler("He","plus",100,20,30,true,true,"haha","led","positive");
 t[0].show(t);
 System.out.println("Select num of vehicles to compare: ");
  n=sc.nextInt();
 System.out.println("Select indexes of vehicles: ");
 int a[]=new int[n];
 for(int i=0;i<n;i++){
 a[i]=sc.nextInt();}
 t[0].compare(t,a,n);
}}
 
 
 
 