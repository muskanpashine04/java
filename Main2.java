class employee{
    private int salary;
    private String name;
    private String id;
void getdetails(String name,int salary, String id){ //getter function
this.name=name;
this.salary=salary;
this.id=id;
}

void setdetails(){
    System.out.println("employee name"+name);
    System.out.println("employee salary"+salary);
    System.out.println("employee id"+id);
}
}
class Main2 {
    public static void main(String[] args) {
        employee x=new employee();
        x.getdetails("muskan",90000,67676);
        x.setdetails();   //it will print name,salary and id
    }
}


