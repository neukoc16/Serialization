
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class SchuelerBL {

    private ArrayList<Schueler> klasse = new ArrayList<>();

    public void add(Schueler s) {
        klasse.add(s);
    }

    public void save(File f) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Schueler s : klasse) {
            oos.writeObject(s);

        }
        oos.flush();
        oos.close();
    }

    public void load(File f) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        while ((line = br.readLine()) == null) {
            String[] lines = line.split(";");
            klasse.add(new Schueler(lines[0], LocalDate.parse(lines[1])));

        }
    }

    public String print() {
        String st = "";
        for (Schueler schueler : klasse) {
            st += schueler.toString();
        }
        return st;
    }
}
