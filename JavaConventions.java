package OPENCSV;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingCsv {
    public static void main(String[] args) throws IOException, CsvException { 
        Reader reader= Files.newBufferedReader(Paths.get("Student.txt"));
        //parser!
        CSVParser parser=new CSVParserBuilder()
                .withSeparator('\t')
                .build();


        CSVReader object=new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();


        //read the contents of the file!

        List<String[]> data=object.readAll(); //returns a list of Strings from the file
//3 ways for using data

        for(int index=0;index<4;index++) {
            System.out.println(data.get(index)[0]);// 0th line object
        }


        for(String[] everyElements: data){
            System.out.println(everyElements[0]);
        }

        data.stream()
                .forEach(everyElements-> System.out.println(everyElements[0]));
    }

}

