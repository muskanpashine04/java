interface Client{  //interface is used by interface keyword , we don't use class keyword
    void print(); // we can or cannot use abstract keyword
    void show();// only abstract method can be define in interface but we can define other methods in abstract class

}

class Dev implements Client{ //we use implements keyword to override interface
    public void print(){ //to define abstract method we always use public keyword //these are public by default
        System.out.println("print the bill");
    }

    public void show(){  //print and show method are public and static
        System.out.println("show the menu");
    }
}

class Hello{
    public static void main(String[] args) {
        Dev obj=new Dev(); //to call method wemake object of child
        obj.print();
        obj.show();
    }
}

//keyword=>public, protected, private and default
//public has more accessibility then default as public can access different files from different package while default can access different file from same package