import java.io.FileReader;
import java.io.IOException;
public class ThrowsExample{

    public static void main(String[] args){
        try{
            readfile();
        } catch(IOException e){
            System.out.println("Handled in main: " + e.getMessage());
        }
    }

    public static void readfile() throws IOException {
        try(FileReader fr = new FileReader("data.txt")){
            System.out.println("File Opened");
        }
    }
}