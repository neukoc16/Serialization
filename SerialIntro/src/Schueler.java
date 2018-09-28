
import java.time.LocalDate;

public class Schueler {

    private String name;
    private LocalDate birthday;

    public Schueler(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

}
