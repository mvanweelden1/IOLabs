package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class TextReaderApp {

    public static void main(String[] args) {

        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "contactlist.txt");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));

            String line = in.readLine();
            while (line != null) {
                Contact c = new Contact();
                    String[] str = line.split("\\|");
                    c.setFirstName(str[0]);
                    c.setLastName(str[1]);
                    c.setStreetAddress(str[2]);
                    c.setCity(str[3]);
                    c.setState(str[4]);
                    c.setZipCode(str[5]);
                    c.setEmail(str[6]);
                    c.setPhoneNumber(str[7]);
                    
                    System.out.println(c);

                line = in.readLine();
                // strips out any carriage return chars
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }
}
