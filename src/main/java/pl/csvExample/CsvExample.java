package pl.csvExample;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
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
        Reader in = new FileReader("C:\\Users\\Pepe\\Desktop\\kopiagrafiku.csv");
        //  Reader in = new FileReader("add your file here");

        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        for (CSVRecord record : records) {
            String column = record.get(0).replaceAll(";", " ");
            for (int i = 0; i < column.length(); i++) {
                column.split(",");
            }
           // System.out.println(column);
            for (int i = 0; i <column.length() ; i++) {
                String nrKierowcy = record.get(0);
     //         String linia = record.get(1);
  //            String godzRozp = record.get(1);
 //             String godzZak = record.get(2);

              System.out.println("nr: "+nrKierowcy);
         //     System.out.println(" | linia: "+linia);
       //       System.out.println(" | rozp: "+godzRozp);
     //         System.out.println("zak: "+godzZak);

            }

        }
    }
}
 //   String nrKierowcy = record.get("A");
//              String linia = record.get("B");
//              String godzRozp = record.get("C");
//              String godzZak = record.get("D");
//
//              System.out.println("nr: "+nrKierowcy);
//              System.out.println(" | linia: "+linia);
//              System.out.println(" | rozp: "+godzRozp);
//              System.out.println("zak: "+godzZak);
 //            System.out.println(nrKierowcy);