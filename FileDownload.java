 class FileDownload {
    public static void download(String file){
        for(int i=1;i<5;i++){
            System.out.println(file+" "+"downloading.........."+(i*20)+"%");
        
try{
    Thread.sleep(2000);
}catch(Exception e){

}
        }
        System.out.println(file+"done");
    }
    
}


class Hello{
    public static void main(String[] args) {
        FileDownload obj=new FileDownload();
        obj.download("File A");
        obj.download("file B"); //total time taken 10 sec

    }
}

//File A downloading...........20%
//File A downloading...........40%
//File A downloading...........60%
//File A downloading...........80%
//File A downloading...........100%
//file A done
//File B downloading...........20%
//File B downloading...........40%
//File B downloading...........60%
//File B downloading...........80%
//File B downloading...........100%
//file B done