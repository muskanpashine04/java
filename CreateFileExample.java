import java.io.File; //Create Read Update Delete CRUD  //E-Commerce site
import java.io.IOException;
public class CreateFileExample{  //alternate choice would be using database
    public static void main(String[] args) {
        try{
            File file = new File("new.txt");  //to create a file
            if(file.createNewFile()){
                System.out.println("file created"+file.getName());
            }else{
                System.out.println("file already exists");
            }
        } catch(IOException e)                  {
System.out.println("an error occured");
        }
            
                                               

        
    }
}

