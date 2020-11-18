package kata4.View;

import java.util.List;
import kata4.Model.Histogram;
import kata4.Model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mailList) {
       Histogram<String> histogram = new Histogram<>();
       
        for (Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }
       
       return histogram;
    }
    
}
