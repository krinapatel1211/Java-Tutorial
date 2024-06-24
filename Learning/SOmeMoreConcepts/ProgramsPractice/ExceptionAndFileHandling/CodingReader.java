package Learning.SOmeMoreConcepts.ProgramsPractice.ExceptionAndFileHandling;

import java.io.FileReader;
import java.io.IOException;

public class CodingReader {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        
        try (FileReader fileReader = new FileReader(fileName)){
            int read = 0;
            do{
                read = fileReader.read();
                System.out.println((char)read);
            }
            while(read!=-1);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
