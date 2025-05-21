interface Client{  
     void show();
}

interface Client2{  
     void print(); //void show();
}

class Hello implements Client,Client2{ //Multiple Inheritance by Interface  //if both the client wants same feature i.e. show
    public void show(){   //if both the interface has same method show we ddefine it only once
        System.out.println("this is common feature for client1 and client2");
    }
    public void print(){
        System.out.println("print the bill");
    }

    
    public static void main(String[] args){
        Hello obj=new Hello();
        obj.show();
        obj.print();


    }
}