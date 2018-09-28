
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SchuelerBL {

    private ArrayList<Schueler> klasse = new ArrayList<>();

    public void add(Schueler s) {
        klasse.add(s);
    }

    public void save(File f) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        for (Schueler s : klasse) {
            bw.write(s.getName());
            bw.write(";");
            bw.write(s.getBirthday().toString());
        }
    }

}
