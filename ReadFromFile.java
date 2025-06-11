import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {  //to read data i.e. to print data into the console
    public static void main(String[] args) {
        try{
            File file=new File("new.txt");
            Scanner scanner=new Scanner(file);
           
                while(scanner.hasNextLine()){
                    String data=scanner.nextLine();
                    System.out.println(data);
                }scanner.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("an error occurred");
            }
        }
    }

