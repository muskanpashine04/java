class FullName{
    String fullName="Muskan";
    String lastName="Pashine";
    void dun(){
    System.out.println(fullName+"  "+lastName);
    }

}
class Student{
    String name="hello";   //non static variable
    void sum(int a,int b){      //non static function 
        System.out.print(name);    //non static function call can call a non static variable without making object
        System.out.print(a+b);
    }
}

class Hello{  //we can make multiple class in single file
    public static void main(String[] args){
        Student obj=new Student(); //new keyword is used to make object everytime
        obj.sum(5,4);


        Student obj1=new Student();
        obj1.sum(2,3);       //we can make multiple objects of a single class
         System.out.println(obj1.name); //to call a non static variable we have to make object


         FullName obj2=new FullName();
         obj2.dun();


    }
}