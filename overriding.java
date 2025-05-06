class Vehicle{
    void run(){
        System.out.println("run for life");
    }
}

class Bike extends Vehicle{
    void run(){  //method overiding can have same function name as well as same parameter
        System.out.println("run for fun");
        super.run(); //super keyword is used to call parent and used in child class
    }
}

class Hello{
    public static void main(String[]args){
        Vehicle obj=new Bike();  //storing child's object in parents refernce
        obj.run();  //print run for fun
       //   super.run(); 
    }
}