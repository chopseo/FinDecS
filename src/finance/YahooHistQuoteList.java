package finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by neo on 15.06.14.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class YahooHistQuoteList {


    private List<YahooHistQuote> results;

    @XmlElement(name="results", type=YahooHistQuote.class)
    public List<YahooHistQuote> getResults() {
        return results;
    }

    public void setResults(List<YahooHistQuote> results) {
        this.results = results;
    }

}
