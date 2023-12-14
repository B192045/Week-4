import java.util.*;

class Monster{
  public void attack(){
   System.out.println("This is a monster attack");}}
   
 class Firemonster extends Monster{
  public void attack(){
   System.out.println("this is fire attack");}}
   
   class Watermonster extends Monster{
    public void attack(){
     System.out.println("this is water attack");}}
    
   class Stonemonster extends Monster{
  public void attack(){
   System.out.println("this is stone attack");}}
   
   class Mon{
   public static void main(String args[]){
    Monster m1=new Monster();
    Monster m2=new Firemonster();
    Monster m3=new Watermonster();
    Monster m4=new Stonemonster();
    m2.attack();
    m3.attack();
    m4.attack();}}
    
    
   
