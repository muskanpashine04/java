class A{
    void sum(){
        System.out.println("A");
    }
}
class B{
    void sum(){
        System.out.println("B");
    }
}
class C extends A,B{ //java does not support multiple inheritance , we use interface for that  //Interface is important for web development
    public static void main(String [] args){
C obj=new C();
obj.sum();  //WHY it does not support multiple inheritance? compiler got confused which sum method to call
    }
}