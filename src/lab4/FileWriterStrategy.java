package lab4;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public interface FileWriterStrategy {
    
    public abstract void writeToFile(String data, boolean append);

}
