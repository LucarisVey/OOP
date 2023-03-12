import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Text text = new Text();
        text.readText();
        text.textEditing();
        text.textWriting();
    }
}