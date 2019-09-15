package pl.csvExample;


import java.time.LocalTime;
public class Grafik {
    protected String nrSluzbowy;
    private String linia;
    private LocalTime godzRozpoczecia;
    private LocalTime godzZakonczenia;

    public Grafik(String nrSluzbowy, String linia, LocalTime godzRozpoczecia, LocalTime godzZakonczenia) {
        this.nrSluzbowy = nrSluzbowy;
        this.linia = linia;
        this.godzRozpoczecia = godzRozpoczecia;
        this.godzZakonczenia = godzZakonczenia;
    }

    public String getNrSluzbowy() {
        return nrSluzbowy;
    }

    public void setNrSluzbowy(String nrSluzbowy) {
        this.nrSluzbowy = nrSluzbowy;
    }

    public String getLinia() {
        return linia;
    }

    public void setLinia(String linia) {
        this.linia = linia;
    }

    public LocalTime getGodzRozpoczecia() {
        return godzRozpoczecia;
    }

    public void setGodzRozpoczecia(LocalTime godzRozpoczecia) {
        this.godzRozpoczecia = godzRozpoczecia;
    }

    public LocalTime getGodzZakonczenia() {
        return godzZakonczenia;
    }

    public void setGodzZakonczenia(LocalTime godzZakonczenia) {
        this.godzZakonczenia = godzZakonczenia;
    }

    @Override
    public String toString() {
        return "Grafik{" +
                "nrSluzbowy='" + nrSluzbowy + '\'' +
                ", linia='" + linia + '\'' +
                ", godzRozpoczecia='" + godzRozpoczecia + '\'' +
                ", godzZakonczenia='" + godzZakonczenia + '\'' +
                '}';
    }
}
