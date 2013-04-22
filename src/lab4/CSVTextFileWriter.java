package lab4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class CSVTextFileWriter implements FileWriterStrategy{
    
    private File file;

    public CSVTextFileWriter(String filePath) {
        setFile(new File(filePath));
    }
    
    @Override
    public void writeToFile(String data, boolean append) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(file, append)));
            writer.println(data);
            
        } catch (IOException ex) {
            Logger.getLogger(CSVTextFileWriter.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                writer.close();
            } catch (Exception e) {
            }
        }
    }

    public final File getFile() {
        return file;
    }

    public final void setFile(File file) {
        this.file = file;
    }
    
    public static void main(String[] args) {
        CSVTextFileWriter writer1 = new CSVTextFileWriter("src/test.out");
        
        List<String> data = new ArrayList<String>();
        data.add("Jane|Smith|555 West Ave.|Waukesha|WI|55555|e@b.com|555-555-5558");
        data.add("John|Smith|555 West Ave.|Waukesha|WI|55555|f@b.com|555-555-5558");
        data.add("Jack|Smith|555 West Ave.|Waukesha|WI|55555|g@b.com|555-555-5558");
        
        for (String string : data) {
            writer1.writeToFile(string, true);
        }
    }
   
    
    

}
