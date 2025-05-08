abstract class Payment{  //abstract class  no obect declaration
    abstract void pay(int a); //abstract method    no body
    void success{
        System.out.println("payment done");

    }
}
class UpiPayment extends Payment{  //to use an abstract method we must overide it
void pay(int a){   //inherit the abstract method
    System.out.println("use Upi" +a);
}
}

class NetBanking extends Payment{      //hierarchical inheritance
    void pay(int a){
        System.out.println("use net banking");
    }
    }

class Hello{
    public static void main(String[]args){
        Payment obj=new UpiPayment();  //object of child is stored in parents reference
        
        obj.pay(25000);  //object creation of child class through we inherit abstract method and overide it
        obj.success();

        Payment obj1=new NetBanking();   //object of child is stored in parents reference
        obj1.pay(25000);
        obj1.success();

    }

}