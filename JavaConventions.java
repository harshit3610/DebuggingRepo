package OPENCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;import java.io.Reader;import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingCsv {
    public static void main(String[] args) throws IOException, CsvException {
        Reader reader= Files.newBufferedReader(Paths.get("Student.txt"));
        CSVParser Parser=new CSVParserBuilder()
                .withSeparator('\t')
                .build();
        CSVReader object=new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();
        //read the contents of the file!
        List<String[]> data=obj.readAll();                 //returns a list of Strings from the file
        for(String[]  arr: data){
            System.out.println(arr[0]);
        }
    }	

}

