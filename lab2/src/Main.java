import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
    Text text = new Text();

    System.out.println("////////////RESULT///////////");
    text.printTextBeforeProcessing();
    text.textEditing();
    text.printTextAfterProcessing();
    }
}