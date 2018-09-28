
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
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
            bw.newLine();

        }
        bw.flush();
        bw.close();
    }

    public void load(File f) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        while ((line = br.readLine()) == null) {
            String[] lines = line.split(";");
            klasse.add(new Schueler(lines[0], LocalDate.parse(lines[1])));

        }
    }
}
