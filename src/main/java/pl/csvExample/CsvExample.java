package pl.csvExample;

import com.mongodb.*;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CsvExample {
    private static Grafik grafik;

    public CsvExample(Grafik grafik) {
        this.grafik = grafik;
    }

    public static void main(String[] args) throws IOException {
        //mongo db
        MongoClient mongo = new MongoClient("localhost", 27017);
        DB db = mongo.getDB("test");
        DBCollection collection = db.getCollection("schedule_uploadfile");


        hashMap_Example(collection);
        DBCursor cursor = collection.find();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }


    }

    private static void hashMap_Example(DBCollection collection) throws IOException {
        Map<String, Object> documentMap = new HashMap<String, Object>();
        Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\Pepe\\Desktop\\kopiagrafiku.csv"));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.newFormat(';'));
        documentMap.put("date", "15.09.2019");
        documentMap.put("rodzaj_rozkladu", "powszedni");
        for (CSVRecord record : csvParser) {
            Map<String, Object> documentMapDetail = new HashMap<String, Object>();
            documentMapDetail.put("workNumber", record.get(0));
            if (record.get(0).isEmpty())
                continue;
            documentMapDetail.put("busLine", record.get(1));
            documentMapDetail.put("startTime", record.get(2));
            documentMapDetail.put("endTime", record.get(3));
            documentMap.put("grafik_dzienny", documentMapDetail);
            collection.insert(new BasicDBObject(documentMap));
        }
    }
}