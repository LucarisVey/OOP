import javax.management.StringValueExp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Text {

    private String text;
    private StringBuilder textBeforeProcessing = new StringBuilder();
    private StringBuilder textAfterProcessing = new StringBuilder();
    int number;
    char character;
    private String separator = File.separator;
    private String pathRead = "." + separator + "resources" + separator + "textInput.txt";
    private String pathWrite = "." + separator + "resources" + separator + "textOutput.txt";


    public void readText() {
        try {
            File readText = new File(pathRead);
            try {
                Scanner scanner = new Scanner(readText);
                text = scanner.nextLine();
                if (text.length() == 0) {
                    throw new NullPointerException();
                }
                textBeforeProcessing.append(text);
                try {
                    number = scanner.nextInt();
                    scanner.nextLine();
                    try{
                        character = scanner.next().charAt(0);
                        scanner.close();
                    }catch(NoSuchElementException e2){
                        System.out.println("Character not found!");
                    }
                }catch (InputMismatchException e2){
                    System.out.println("Number not found!");
                }
            }catch (NullPointerException e1){
                System.out.println("Text not found!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        System.out.println("Finished reading file!!");

    }

    public void textEditing(){
        StringBuilder newString = new StringBuilder(text);
        String[] after = newString.toString().split("[[, ?.@]+]");

        for (int i=0; i<after.length; i++)
        {
            if(after[i].length()>number)
            {
                after[i] = after[i].replace(character, '\0');
            }
            textAfterProcessing.append(after[i]).append(" ");
        }
        System.out.println("Finished changing text!");

    }

    public void textWriting(){
        try {
            File file = new File(pathWrite);
            PrintWriter print = new PrintWriter(pathWrite);
            print.println("Text before processing:");
            print.println(textBeforeProcessing);
            print.println("");
            print.println("Text after processing:");
            print.println(textAfterProcessing);
            print.close();
        } catch (FileNotFoundException e) {
            System.out.println("File to write not found!");
        }
        System.out.println("Finished writing text in file!");
    }
}
