package lab4;

import java.util.List;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public interface FileReaderStrategy {

    public abstract List<String> readFile();
}
