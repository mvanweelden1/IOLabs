package lab1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class TextWriterApp {

    public static void main(String[] args) throws IOException {
        File dataFile = new File(File.separatorChar + "temp" + File.separatorChar
                + "contactlist.txt");

        boolean append = true;
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(dataFile, append)));
        writer.println("Jane|Smith|555 West Ave.|Waukesha|WI|55555|e@b.com|555-555-5558");
        writer.close();
        TextReaderApp.main(args);
    }
    
}
