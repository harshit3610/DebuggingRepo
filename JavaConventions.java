import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JavaConventions{
    public static void main(String[] args) throws IOException,CsvException{
        Reader reader= Files.newBufferedReader(Paths.get("Student.txt"));

        CSVParser Parser=new CSVParserBuilder()
                .withSeparator('\t')
                .build();

        CSVReader Object1=new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();


        //read the contents of the file!
        List<String[]> data=Object1.readAll();

        //returns a list of Strings from the file
        // 3 ways for using data
        for(int index=0;index<4;index++){
            System.out.println(data.get(index)[0]);// 0th line object
        }

        for(String[] arr : data){
            System.out.println(arr[0]);
        }

        data.stream()
        .forEach(x-> System.out.println(x[0]));
    }

}


