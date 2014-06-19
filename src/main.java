import finance.*;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by neo on 25.05.14.
 */

public class main {

    public static void main(String[] args) {

//        System.out.println(
//                FdsRest.getRestXml()
//        );

        try {

            YahooQuery query = FdsMarshaller.getYahooHistQuoteList(FdsRest.getRestXml());

//            for (YahooHistQuote yahooHistQuote : yahooHistQuotes) {
                System.out.println(query);
//            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
