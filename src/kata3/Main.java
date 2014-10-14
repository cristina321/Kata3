
package kata3;

public class Main {
    public static void main (String [] args ){
        MailReader reader = new MailReader("mails.txt");
        HistogramBuild <String> builder= new HistogramBuild<>();
        Histogram <String> histogram=builder.build(reader.readDomains());
        
        new HistogramViewer<String>().print(histogram);
    }
}
