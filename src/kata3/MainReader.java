
package kata3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainReader {
    private final String filepath;

    public MainReader(String filpath) {
        this.filepath = filpath;
    }
    public String[] readDomains(){
        ArrayList<String> domainList= new ArrayList<>();
        try {
            BufferedReader read = new BufferedReader(new FileReader (filepath));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return domainList.toArray(new String [domainList.size()]);
    }
    
    
    
}
