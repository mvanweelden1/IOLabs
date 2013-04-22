package lab4;

import java.io.IOException;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public interface FileReaderStrategy<T> {

    public abstract T readFile() throws IOException;
}
