import java.util.Scanner;

public class Text {
    private String text;
    private String textBeforeProcessing;
    private String textAfterProcessing = "";
    private int k;
    private String character;

    public Text () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        text = scanner.nextLine();
        textBeforeProcessing = text;
        System.out.println("Enter a number:");
        k = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the character to be deleted:");
        character = scanner.nextLine();
    }
    public void textEditing(){
        String[] someText = text.split("[[, ?.@]+]");
        for (int i = 0; i<someText.length; i++){
            if (someText[i].length()>k){
                String newText = someText[i].replace(character, "");
                someText[i] = newText;
            }
            textAfterProcessing += (someText[i] + " ");
        }
    }
    public void printTextBeforeProcessing(){
        System.out.println("Text before processing:" + textBeforeProcessing);
    }
    public void printTextAfterProcessing(){
        System.out.println("Text after processing:" + textAfterProcessing);
    }

}
