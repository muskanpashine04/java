class Parent{
    void sum(int a){
        System.out.println("hello");
    }

    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}



class Helloo{
    public static void main(String[] args){
        Parent obj=new Parent();
        obj.sum(23);
        obj.sum(23,4);
        obj.sum(23,5,6);
    }
}