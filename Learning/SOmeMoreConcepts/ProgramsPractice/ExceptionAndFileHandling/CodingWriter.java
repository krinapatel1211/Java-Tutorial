package Learning.SOmeMoreConcepts.ProgramsPractice.ExceptionAndFileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CodingWriter {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        
        try (FileWriter fileWriter = new FileWriter(fileName)){
            
            fileWriter.write("This is Krina's file\n");
            for (int i = 0; i < 100; i++) {
                fileWriter.write("*");
                if(i%100==0){
                    fileWriter.write("\n");
                }
            }
            fileWriter.flush();
            System.out.println("File Written Successfully!");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
