import java.io.FileWriter;
import java.io.IOException;
public class FileHandler{


public void createFile(String tableName, String columns){
    try {
        FileWriter fw = new FileWriter("Data/"+tableName + ".txt");
        fw.write(columns);
        fw.close();
        System.out.println("File created successfully!");
    } catch(IOException e){
        System.out.println("Error occurred");
    }
}
}