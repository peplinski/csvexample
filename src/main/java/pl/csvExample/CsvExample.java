package pl.csvExample;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CsvExample {
    private static final Object String = "";

    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("add your file here");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        for (CSVRecord record : records) {
            String columnOne = record.get(0).replaceAll(";"," ");
            columnOne.split(",");
            columnOne.trim();
            System.out.println(columnOne);
            System.out.println("");
        }

    }
}
