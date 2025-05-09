abstract class Shape{  //abstract class  no obect declaration
    abstract void area(int a,int b); //abstract method    no body
    //abstract void area(int a,int b);
    }

class Circle extends Shape{  //to use an abstract method we must overide it
void area(int a,int b){   //inherit the abstract method
    System.out.println("area of circle is" +(3.14*a*a));
}
}

class Rectangle extends Shape{      //hierarchical inheritance
    void area(int l,int b){
        System.out.println("area of rectangle is"+(l*b));
    }
    }

class Hello{
    public static void main(String[]args){
        Shape obj=new Circle();  //object of child is stored in parents reference
        
        obj.area(25);  //object creation of child class through we inherit abstract method and overide it
       

        Shape obj1=new Rectangle();   //object of child is stored in parents reference
        obj1.area(20,30);
        

    }

}