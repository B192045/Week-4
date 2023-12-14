/*2.Suppose that we are required to model students and teachers in our application. We can define 
a superclass called Person to store common properties such as name and address, and subclasses 
Student and Teacher for their specific properties. For students, we need to maintain the courses 
taken and their respective grades; add a course with grade, print all courses taken and the 
average grade. Assume that a student takes no more than 30 courses for the entire program. For 
teachers, we need to maintain the courses taught currently, and able to add or remove a course 
taught. Assume that a teacher teaches not more than 5 courses concurrently.*/

import java.util.*;

class Person{
 String name;
 String address;
Person(String name,String address){
 this.name=name;
 this.address=address;}}

class Student extends Person{
 HashMap<String,Integer> hm=new HashMap<>();
 String course;
 int numofcourse=0;
 int grade;
 Student(String name,String address){
 super(name,address);}
 
 void addcourse(String course,int grade){
 if(numofcourse<30){
 hm.put(course,grade);
 numofcourse++;}
 else
 System.out.println("Exceeded");}

 void print(){
 for(String course:hm.keySet()){
 System.out.println(course);}}

 void average(){
 if(numofcourse==0)
 System.out.println(0);
 int total=0;
 for(int grade:hm.values())
 total=total+grade;
 System.out.println((double)total/numofcourse);}}

class Teacher extends Person{
 String courses_taught;
 int num_of_course;
 Teacher(String name,String address){
 super(name,address);}
 ArrayList<String> list=new ArrayList<>();
 void addcourse(String course_taught){
 if(!list.contains(course_taught)&&num_of_course<5){
 list.add(course_taught);
 num_of_course++;}
 else
 System.out.println("Exceeded");}

void removecourse(String course_taught){
 if(num_of_course<5){
 list.remove(course_taught);
 num_of_course--;}
 }

void print(){
System.out.println(list);}}



class Week4_2{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 String name=sc.nextLine();
 String address=sc.nextLine();
 Student s=new Student(name,address);
 Teacher t=new Teacher(name,address);
 String names=sc.nextLine();
 String addresss=sc.nextLine();
 System.out.println("Enter num of courses: ");
 int n=sc.nextInt();
 sc.nextLine();
 for(int i=0;i<n;i++){
 System.out.println("Enter course along with grade: ");
 String a=sc.nextLine();
 int b=sc.nextInt();
 sc.nextLine();
 s.addcourse(a,b);
 }
 s.print();
 s.average();
 System.out.println("Enter num of courses to be added: ");
 int no=sc.nextInt();
 sc.nextLine();
 for(int i=0;i<no;i++){
 System.out.println("Add a course: ");
 String adding=sc.nextLine();
 t.addcourse(adding);}
 System.out.println("Enter num of courses to be removed: ");
 int np=sc.nextInt();
 sc.nextLine();
 if(np!=0){
 for(int i=0;i<np;i++){
 System.out.println("Remove a course: ");
 String addin=sc.nextLine();
 t.removecourse(addin);}
 t.print();}
 else
 t.print();

}}
