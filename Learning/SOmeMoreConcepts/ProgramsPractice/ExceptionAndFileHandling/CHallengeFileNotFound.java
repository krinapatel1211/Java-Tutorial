package Learning.SOmeMoreConcepts.ProgramsPractice.ExceptionAndFileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CHallengeFileNotFound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file Name: ");
        String fileName = input.next();
        try (FileReader fReader = new FileReader(fileName)) {
            int read = 0;
            do{
                read = fReader.read();
                System.out.print((char)read);
            }
            while(read!=-1);
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File is not found, Handled File Not Found exception");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            input.close();
        }
    }
}
