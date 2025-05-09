 class temperature {
private int celsius;
void setfahrenheit(int celsius){//setter function
    this.celsius=celsius;

}    


int getfahrenheit(){//getter function
    int c=celsius+273;
    return c;
    

}
}
  class Main3{
    public static void main(String[] args) {
        temperature x=new temperature();
        x.setfahrenheit(45);
System.out.println("value is"+x.getfahrenheit());  //value is 318
    }
  }