package lab4;

import java.io.File;

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
    public void writeToFile(String data, Boolean append) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final File getFile() {
        return file;
    }

    public final void setFile(File file) {
        this.file = file;
    }
    
    
   
    
    

}
