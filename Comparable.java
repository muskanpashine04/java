//to sort data as an object and student is an object having more than one attribute
//custom datatype is an object
//comparable is an inbuilt interface comes under lang package does not need to import it
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{ //interface+constructor+class //comparable is an interface
    int age;
    String name;

    public Student(int age,String name){//student constructor under student class
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return age+" " +name;
    }
    public int compareTo(Student s){//compareTo to compare age only
        return this.age-s.age; //if difference is positive it swaps value otherwise doesn't
    }
}

class Hello{
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();//integer is a class  //arraylist does not allow primitive datatype
        list.add(new Student(17,"rahul"));
        list.add(new Student(16,"rohit"));
        list.add(new Student(11,"mohit"));
       list.add(new Student(51,"om"));
 Collections.sort(list);//internally call compareTo
 for(Student s: list){
    System.out.println(s.toString());
 }
    }
}
//output sort data on basis of age
//11,mohit
//16,rohit
//17,rahul
//51,om