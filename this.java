class Hello{
    int age;
    void data(){
        System.out.println(this);  //this will point to current object and print the reference value of obj
    }
    public static void main(String [] args){
        Hello obj=new Hello();
        obj.data();
       
        System.out.println(obj); //it will print reference value 
         

    }
}