package pl.csvExample;


public class Grafik {
    protected String nrSluzbowy;
    private String linia;
    private String godzRozpoczecia;
    private String godzZakonczenia;

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

    public String getGodzRozpoczecia() {
        return godzRozpoczecia;
    }

    public void setGodzRozpoczecia(String godzRozpoczecia) {
        this.godzRozpoczecia = godzRozpoczecia;
    }

    public String getGodzZakonczenia() {
        return godzZakonczenia;
    }

    public void setGodzZakonczenia(String godzZakonczenia) {
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
