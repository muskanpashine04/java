 class student2 {
    private int marks;
    private String name;
    void getdetails(String name,int marks){  //getterfunction
        this.name=name;
        this.marks=marks;


    }
    void setdetails(){  //setter function
        System.out.println("student's marks"+marks);
        System.out.println("student's name"+name);

    }
}


class Main1{
    public static void main (String[]args){
        student2 x=new student2();
        x.getdetails("muskan",478);
        x.setdetails();
    }
}