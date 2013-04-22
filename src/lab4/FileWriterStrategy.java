package lab4;

import java.util.List;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public interface FileWriterStrategy {
    
    public abstract void writeLineToFile(String data, boolean append);
    
    public abstract void writeAllToFile(List<String> data, boolean append);

}
