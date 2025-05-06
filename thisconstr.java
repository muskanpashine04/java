class Student{
    int age; //age instance variable
    Student(int age){  //age local variable
        this.age=age;  //age=age it will print 0 i.e. default value of int even if we pass age as 16 without this keyword
    }
    void print(){
        System.out.println(age);
    }
} 
 
 
 
 class Hello{
   
    public static void main(String [] args){
        Student obj=new Student(16);  // with this keyword it will print age as 16
       
       
       obj.print();
         

    }
}
 