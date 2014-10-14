
package kata3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MailReader {
    private final String filepath;

    public MailReader(String filpath) {
        this.filepath = filpath;
    }
    public String[] readDomains(){
        ArrayList<String> domainList= new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader (filepath));
            while(true){
                String line= reader.readLine();
                if(line==null) break;
                domainList.add(line.split("@")[1]);
            }
        } catch (IOException ex) {
            Logger.getLogger(MailReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return domainList.toArray(new String [domainList.size()]);
    }
    
    
    
}
