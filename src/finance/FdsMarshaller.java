package finance;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.List;

/**
 * Created by neo on 15.06.14.
 */
public class FdsMarshaller {

    public static YahooQuery getYahooHistQuoteList(InputStream xmlStream) throws JAXBException {


        JAXBContext context = JAXBContext.newInstance(YahooHistQuoteList.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        YahooQuery yahooQuery = (YahooQuery) unmarshaller.unmarshal(xmlStream);


        return yahooQuery;

    }


}
