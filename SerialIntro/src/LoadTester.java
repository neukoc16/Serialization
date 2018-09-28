
import java.io.File;
import java.io.IOException;

public class LoadTester {

    public static void main(String[] args) throws IOException {
        File f = new File("./klasse.csv");
        SchuelerBL bl = new SchuelerBL();
        try {
            bl.load(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(bl.print());
    }
}
