package kata4;

import kata4.Model.Histogram;
import kata4.Model.Mail;
import kata4.View.HistogramDisplay;
import kata4.View.MailHistogramBuilder;
import kata4.View.MailListReader;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = new String("emails.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "HISTOGRAM...");
        histogramDisplay.execute();
        
    }
    
}
