class Atm{
    private int a;
    void getrupee(int a){ //getter function
        this.a=a;

    }

    int setrupee(){  //setter function
        return a;
    }
}

 class Encapsulation {
    public static void main(String[] args) {
        Atm x=new Atm();
        x.getrupee(9000);
        System.out.println("amount"+x.setrupee());   //amount=9000
    }
    
}
