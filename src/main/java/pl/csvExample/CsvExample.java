package pl.csvExample;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.stream.Stream;

public class CsvExample {
    private static Grafik grafik;

    public CsvExample(Grafik grafik) {
        this.grafik = grafik;
    }

    public static void main(String[] args) throws IOException {
        readData();

    }

    static void readData() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\Pepe\\Desktop\\kopiagrafiku.csv"));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.newFormat(';'));
        for (CSVRecord record : csvParser) {

            //int nrKierowcy = Integer.parseInt(record.get(0));
            String nrKierowcy = record.get(0);
            if (nrKierowcy.isEmpty())
                continue;
            String linia = record.get(1);
            //LocalTime godzRozp = LocalTime.parse(record.get(2));
            String godzRozp = record.get(2);
            String godzZak = record.get(3);

            System.out.println(nrKierowcy + " " + linia + " " + godzRozp + " " + godzZak);
        }
    }
}