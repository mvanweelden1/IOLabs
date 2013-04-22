package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class CSVTextFileReader implements FileReaderStrategy{
    
    private File file;

    public CSVTextFileReader(String filePath) {
        
        setFile(new File(filePath));
    }
    
    

    @Override
    public List<String> readFile() {
        
        BufferedReader in = null;
        List<String> rawData = null;
        try {
            in = new BufferedReader(new FileReader(file));
            
            String line = in.readLine();
            rawData = new ArrayList<String>();
            
            while(line != null){
               rawData.add(line); 
               line = in.readLine();
            }
        } catch (Exception e) {
        }finally{
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        return rawData;
        
    }

    public final File getFile() {
        return file;
    }

    public final void setFile(File file) {
        this.file = file;
    }
    
//    public static void main(String[] args) {
//        
//        CSVCommaTextFileReader reader = new CSVCommaTextFileReader
//                (File.separatorChar + "temp" + File.separatorChar
//                + "contactlist.txt");
//        
//        List<String> data = reader.readFile();
//        
//        for (String string : data) {
//            System.out.println(string);
//            
//        }
//    }

}
