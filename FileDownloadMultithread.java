 class downloadFile extends Thread {
    String fileName;
    public  downloadFile(String fileName){
        this.fileName=fileName;
    }
    public void run(){
for(int i=1;i<5;i++){
            System.out.println(fileName+" "+"downloading.........."+(i*20)+"%");
        
try{
    Thread.sleep(2000);
}catch(Exception e){

}
    }
    System.out.println(fileName+"done");
        
        }
        
    }
    



class Hello{
    public static void main(String[] args) {
        downloadFile obj=new downloadFile("File A");
        
        downloadFile obj1=new downloadFile("File B");//simultaneously both file started downloading  using multithread //it takes 5sec
        obj.start();
        obj1.start();
    }
}

//File A downloading...........20%
//File B downloading...........20%
//File B downloading...........40%
//File A downloading...........40%
//File B downloading...........60%
//File A downloading...........60%
//File A downloading...........80%
//File B downloading...........80%
//File A downloading...........100%
//File B downloading...........100%
//file A done
//file B done




