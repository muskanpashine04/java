import java.io.File;

public class DeleteFile {  //delete file
 public static void main(String[] args) { 
    File file=new File("new.txt");
    if(file.delete()){
        System.out.println("deleted the file"+file.getName());
    }else{
        System.out.println("failed to delete the file.");
    }
 }   
}
