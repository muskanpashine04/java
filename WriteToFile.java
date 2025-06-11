
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile{  //to append data add data into the file
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("new.txt");
           writer.write("hello this is the test message written for text file");
            writer.close();
System.out.println("successfully wrote to the file");
        } catch(IOException e)                  {
System.out.println("an error occured");
        }
            
                                               

        
    }
}


    
