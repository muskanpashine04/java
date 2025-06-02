import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; //comparator needs to import seperately
class Student {
    int age;
    String name;
    int rollno;
    public Student(int age,String name,int rollno){
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }
   
}
 class sortByName implements Comparator<Student>{ //makes seperate classes
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name); //string compares on basis of its ASCII value
    }
        
    }

    class sortByAge implements Comparator<Student>{
    public int compare(Student s1,Student s2){//compare method   s1,s2 variable names
       
        return s1.age-s2.age;
    }
        
    }

class Hello{
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        
        list.add(new Student(10,"rohit",45));
        list.add(new Student(32,"mohit",34));
       list.add(new Student(10,"om",55));
 Collections.sort(list,new sortByName()); 
 for(Student s: list){
    System.out.println(s);
 }
    }
}