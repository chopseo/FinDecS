package finance;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by neo on 15.06.14.
 */

@XmlRootElement(name="query")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class YahooQuery {


    private String xmlns;

    @XmlAttribute
    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }


    private List<YahooHistQuote> results;

    @XmlElement(name="results")
    public List<YahooHistQuote> getResults() {
        return results;
    }

    public void setResults(List<YahooHistQuote> results) {
        this.results = results;
    }



//
//    private YahooHistQuoteList yahooHistQuoteList;
//
//    @XmlElement(name="results", type=YahooHistQuoteList.class)
//    public YahooHistQuoteList getYahooHistQuoteList() {
//        return yahooHistQuoteList;
//    }
//    public void setYahooHistQuoteList(YahooHistQuoteList yahooHistQuoteList) {
//        this.yahooHistQuoteList = yahooHistQuoteList;
//    }

}
