import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.text.Document;
public class wordtopdf {
    public static void main(String[] args) {
        Document doc = new Document("introduction.docx");
        doc.save("output.pdf");
    }
}