package pl.csvExample;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CsvExample {
    private static Grafik grafik;

    public CsvExample(Grafik grafik) {
        this.grafik = grafik;
    }

    public static void main(String[] args) throws IOException {
        readData();

    }

   static void readData() throws IOException {
        Reader in = new FileReader("C:\\Users\\Pepe\\Desktop\\kopiagrafiku.csv");
        //  Reader in = new FileReader("add your file here");

        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        for (CSVRecord record : records) {
            String column = record.get(0).replaceAll(";", " ");
            for (int i = 0; i < column.length(); i++) {
                column.split(",");
            }
            System.out.println(column);
        }
    }
}
