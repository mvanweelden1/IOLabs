package lab4;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class FileService {
    private FileReaderStrategy reader;
    private FileWriterStrategy writer;

    public FileService(FileReaderStrategy reader, FileWriterStrategy writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void writeFile(){
        
    }
    
    public void readFile(){
        
    }

}
