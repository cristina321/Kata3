
package kata3;

import java.lang.ProcessBuilder.Redirect.Type;

public class HistogramViewer <Type>{
   
   public void print (Histogram <Type> histogram){
       for (Type type : histogram.keySet()) {
           System.out.println(type + "--->" + histogram.get(type));
       }
     
       
   }
    
}
